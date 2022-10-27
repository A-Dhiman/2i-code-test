package com.ad.code;

import java.util.List;
import java.util.Set;
import org.junit.Test;

import static com.ad.code.CodeTestChallenge.createRawListOfNumbers;
import static com.ad.code.CodeTestChallenge.reverseSortedList;
import static com.ad.code.CodeTestChallenge.uniqueSortedList;

public class Tests {

    @Test
    public void testUniqueReverseList() {
        List<Integer> rawUnsortedListOfNumbers = createRawListOfNumbers();
        List<Integer> reverseListOfNumbers = reverseSortedList(rawUnsortedListOfNumbers);
        Set<Integer> uniqueReverseListOfNumbers = uniqueSortedList(reverseListOfNumbers);
        System.out.println("Here is the unique and ordered list of numbers:" + uniqueReverseListOfNumbers);
    }
}