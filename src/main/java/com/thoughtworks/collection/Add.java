package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int result = 0;
        int left = leftBorder;
        int right =rightBorder;
        if (leftBorder > rightBorder){
            left  = rightBorder;
            right = leftBorder;
        }

        for (; left <= right; left++){
                result += left %2 == 0 ? left : 0;
        }

        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int result = 0;
        int left = leftBorder;
        int right =rightBorder;
        if (leftBorder > rightBorder){
            left  = rightBorder;
            right = leftBorder;
        }

        for (; left <= right; left++){
            result += left %2 != 0 ? left : 0;
        }

        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(a -> a * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return (arrayList.stream()
                .mapToInt(a -> a%2 != 0 ? a * 3 + 2 : a)
                .boxed().collect(Collectors.toList()));
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(a -> a%2 != 0)
                .mapToInt(a -> a * 3 + 5)
                .sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(a -> a%2 == 0)
                .sorted(Comparator.naturalOrder())
                .reduce(0, (subtotal , element) -> subtotal+element / 2 );
    }

    public double getAverageOfEven(List<Integer> arrayList) {
       return arrayList.stream()
               .filter(a -> a%2 == 0)
               .mapToDouble(a -> a)
               .average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.contains(specialElment) && specialElment % 2 == 0;

    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(a -> a % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> even = arrayList.stream()
                .filter(a -> a % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> odd = arrayList.stream()
                .filter(a -> a % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        even.addAll(odd);
        return even;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> returnArr = null;
        arrayList = arrayList.stream()
                .map(a -> a *3)
                .collect(Collectors.toList());

        for(int x = 0; x < arrayList.size() ; x++){
            returnArr.add(arrayList.get(x) + arrayList.get(x - 1) + arrayList.get(x + 1));
        }

        return  returnArr;

    }
}
