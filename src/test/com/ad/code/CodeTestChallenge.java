package com.ad.code;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collections;

public class CodeTestChallenge {
    public static List<Integer> createRawListOfNumbers() {
        // List of 10 numbers in the range of [1-100]
        List<Integer> rawListOfNumbers = new ArrayList<>();
        rawListOfNumbers.add(98);
        rawListOfNumbers.add(100);
        rawListOfNumbers.add(1);
        rawListOfNumbers.add(23);
        rawListOfNumbers.add(5);
        rawListOfNumbers.add(1);
        rawListOfNumbers.add(76);
        rawListOfNumbers.add(5);
        rawListOfNumbers.add(100);
        rawListOfNumbers.add(23);

        return rawListOfNumbers;
    }

    // Use collections to sort the list in descending order
    public static List<Integer> reverseSortedList(List<Integer> rawList) {
        Collections.sort(rawList, java.util.Collections.reverseOrder());
        return rawList;
    }


    // Use of sets to get the unique list of items
    public static Set<Integer> uniqueSortedList(List<Integer> rawSortedList) {
        Set uniqueSortedListOfNumbers = new LinkedHashSet(rawSortedList);
        return uniqueSortedListOfNumbers;
    }

}
