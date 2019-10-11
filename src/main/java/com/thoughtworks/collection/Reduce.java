package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

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
             median = (double) (arrayList.get((arrSize / 2) - 1) + (double) arrayList.get(arrSize / 2))/2;
            return median;
        }
            return arrayList.get(arrSize / 2);
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {

    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
