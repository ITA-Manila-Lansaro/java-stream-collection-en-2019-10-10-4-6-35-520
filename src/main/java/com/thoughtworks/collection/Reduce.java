package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream()
                .reduce(0 , (a , b) ->
                        a > b ? a:b);
    }

    public double getMinimum() {
        return arrayList.stream()
                .reduce( 1,(a , b) ->
                        a < b ? a:b);
    }

    public double getAverage() {
        double average = arrayList.stream()
                .reduce(0, (a, b) -> a + b);
        return average/arrayList.size();
    }

    public double getOrderedMedian() {
        arrayList.stream()
                .sorted();
        int arrSize = arrayList.size();
        double median;

        if (arrSize % 2 == 0 ){
             median = (double) (arrayList.get((arrSize / 2) - 1) + arrayList.get(arrSize / 2))/2;
            return median;
        }
            return arrayList.get(arrSize / 2);
    }

    public int getFirstEven() {
        return arrayList.stream()
                .filter(a -> a % 2 == 0)
                .findFirst()
                .get();
    }

    public int getIndexOfFirstEven() {
        return arrayList.indexOf(arrayList.stream()
                .filter(a -> a % 2== 0)
                .findFirst()
                .get());
    }

    public boolean isEqual(List<Integer> arrayListFed) {
        for (int a : arrayList){
            if (!arrayListFed.contains(a))
            {
                return false;
            }
        }
        return true;
    }

//    public Double getMedianInLinkList(SingleLink singleLink) {
//        System.out.println(arrayList.stream().sorted().collect(Collectors.toList()));
//        System.out.println(singleLink.toString());
//        return 9.5;
//    }

    public int getLastOdd() {
        return arrayList.stream()
                .filter(a -> a % 2 != 0)
                .reduce(0, (a , b) -> b);
    }

    public int getIndexOfLastOdd() {
        return arrayList.indexOf(arrayList.stream()
                .filter(a -> a % 2 != 0)
                .reduce(0, (a , b) -> b));
    }
}
