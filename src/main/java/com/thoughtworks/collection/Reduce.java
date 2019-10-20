package com.thoughtworks.collection;

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
                .average()
                .orElseThrow(NoSuchElementException::new);
    }

    public double getOrderedMedian() {
        this.arrayList.stream();
        double median;
        if (this.arrayList.size() % 2 == 0) {
            median = ((double) this.arrayList.get(this.arrayList.size() / 2)
                    + (double) this.arrayList.get(this.arrayList.size() / 2 - 1)) / 2;
        } else {
            median = (double) this.arrayList.get(this.arrayList.size() / 2);
        }
        return median;
    }

    public int getFirstEven() {
        return this.arrayList.stream()
                .filter(val -> val % 2 == 0)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public int getIndexOfFirstEven() {
        return IntStream.range(0, this.arrayList.size())
                .filter(i -> (this.arrayList.get(i)) % 2 == 0)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public boolean isEqual(List<Integer> arrayList) {
        return Arrays.equals(this.arrayList.toArray(), arrayList.toArray());
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        int middleNumber = arrayList.size() / 2;
        if (arrayList.size() % 2 == 0) {
            Double firstNum = new Double(singleLink.getNode(middleNumber).toString());
            Double secondNum = new Double(singleLink.getNode(middleNumber + 1).toString());
            return (firstNum + secondNum) / 2;
        } else
            return new Double(singleLink.getNode(middleNumber + 1).toString());
    }

    public int getLastOdd() {
        return this.arrayList.stream()
                .filter(val -> val % 2 != 0)
                .reduce((a, b) -> b)
                .orElse(0);
    }

    public int getIndexOfLastOdd() {
        int lastOdd = arrayList.stream().filter(number -> number % 2 != 0)
                .reduce((a, b) -> b).get();
        return arrayList.indexOf(lastOdd);
    }
}
