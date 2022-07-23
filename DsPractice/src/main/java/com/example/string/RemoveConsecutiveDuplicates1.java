package com.example.string;

import java.util.*;

public class RemoveConsecutiveDuplicates1 {

    static void removeDuplicates(char[] S) {
        int n = S.length;
        if (n < 2) {
            return;
        }
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (S[j] != S[i]) {
                j++;
                S[j] = S[i];
            }
        }
        System.out.println(Arrays.copyOfRange(S, 0, j + 1));
    }

    public static void main(String[] args) {
        char S1[] = "geeksforgeeks".toCharArray();
        removeDuplicates(S1);
        char S2[] = "aabcca".toCharArray();
        removeDuplicates(S2);
    }
}