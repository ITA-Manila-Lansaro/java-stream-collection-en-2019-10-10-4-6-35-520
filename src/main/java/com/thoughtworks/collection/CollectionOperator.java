package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> toReturn = new ArrayList<>();
        if (left < right){
            for (; left <= right ; left++) {
                toReturn.add(left);
            }
        }else{
            for (; right <= left   ; left--) {
                toReturn.add(left);
            }
        }
        return toReturn;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> toReturn = new ArrayList<>();
        if (left < right){
            for (left = 2; left <= right ; left+=2) {
                toReturn.add(left );
            }
        }else{
            for (; right <= left ; left-=2) {
                toReturn.add(left);
            }
        }
        return toReturn;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> retArray = new ArrayList<>();
        for(int a : array){
            retArray.add(a);
        }
        return retArray.stream()
                .filter(a -> a % 2 ==0)
                .collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstArr = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondArr = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return firstArr.stream()
                .filter(a-> secondArr.contains(a))
                .collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstArr = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> secondArr = Arrays.stream(secondArray).collect(Collectors.toList());
        List<Integer> unCommonElems = secondArr.stream()
                .filter(a-> !firstArr.contains(a))
                .collect(Collectors.toList());
        firstArr.addAll(unCommonElems);
        return firstArr ;
    }
}
