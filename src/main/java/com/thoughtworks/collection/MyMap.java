package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream()
                .map(a -> a*3)
                .collect(Collectors.toList());
    }

    public List<String> mapLetter(){
        return array.stream().
                map(a -> letters[a-1])
                .collect(Collectors.toList());
    }

    public List<String> mapLetters() {

        return array.stream()
                .map(a -> {
                   if (a < 27){
                       Integer twoDValue = a / 26;
                        return letters[twoDValue]+letters[]
                   }
                   return letters[a - 1];
                }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
