package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
       return this.arrayList.stream()
               .mapToInt(v -> v)
               .max().orElseThrow(NoSuchElementException::new);

//                .reduce((n,v) -> n>v ? n:v)
//                .reduce(Integer::)
//                .get();
    }

    public double getMinimum() {
        return this.arrayList
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);
    }

    public double getAverage() {
        return this.arrayList
                .stream()
                .mapToDouble(v -> v)
                .average().orElseThrow(NoSuchElementException::new);
    }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        return this.arrayList.stream()
                .filter(val -> val % 2 == 0)
                .findFirst().orElse(null);
    }

    public int getIndexOfFirstEven() {
        return IntStream.range(0, this.arrayList.size())
                .filter(i -> (this.arrayList.get(i)) % 2 == 0)
                .findFirst()
                .orElse(-1);
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
