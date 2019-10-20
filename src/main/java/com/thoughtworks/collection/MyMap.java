package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        return this.array.stream()
                .map(val -> val * 3)
                .collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (int i = 65; i <= 69; i++) {
            result.add((Character.toString((char) (i))).toLowerCase());
        }
        return result;
    }

    public List<String> mapLetters() {
        return this.array.stream()
                .map(num -> {
                    --num;
                    return num > 25 ? letterList.get(num / 26 - 1) + letterList.get(num % 26) :
                            letterList.get(num % 26);
                })
                .collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        List<Integer> sortFromBig = this.array.stream()
                .collect(Collectors.toList());
        Collections.reverse(sortFromBig);
        return sortFromBig;
    }

    public List<Integer> sortFromSmall() {
        return this.array.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
