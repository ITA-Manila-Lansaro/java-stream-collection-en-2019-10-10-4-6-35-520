package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
       return arrayList.stream()
               .filter(a -> a%2 == 0)
               .mapToDouble(a -> a)
               .average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        return arrayList.stream()
                .map(a -> a *3)
                .map()
    }
}
