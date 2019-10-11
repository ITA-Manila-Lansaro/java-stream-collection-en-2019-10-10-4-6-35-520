package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
           List<Integer> retArr = new ArrayList<>();
           Integer[] test = Stream.of(array)
                .flatMap(Stream::of)
                .toArray(Integer[]::new);

           for (int a : test){
               retArr.add(a);
           }
           return retArr;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> retArr = new ArrayList<>();
        Integer[] test = Stream.of(array)
                .flatMap(Stream::of)
                .toArray(Integer[]::new);

        for (int a : test){
            retArr.add(a);
        }
        return retArr.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
