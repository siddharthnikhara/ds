package com.example.arrayPracticeNew;

import java.util.*;

public class FindTheMissingAndRepeatingNumberRecomonded {

    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 5, 5, 6, 2};//{0, 1};//{7, 3, 4, 5, 5, 6, 2};// {4, 3, 6, 2, 1, 1};//{7, 3, 4, 5, 5, 6, 2};
        Map<Integer, Boolean> numberMap = new HashMap<>();
        int max = arr.length;
        for (Integer i : arr) {
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                System.out.println("Repeating = " + i);
                break;
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
                break;
            }
        }
    }
}
