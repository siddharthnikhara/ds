package com.example.string;

import java.util.Arrays;

public class ShuffleSubstringOfAnotherStringBruteForceEasy {

    public static boolean isShuffleSubstring(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();

        if (len1 > len2) return false;

        char[] s1Chars = s1.toCharArray();
        Arrays.sort(s1Chars); // Sort once

        for (int i = 0; i <= len2 - len1; i++) {
            String sub = s2.substring(i, i + len1);
            char[] subChars = sub.toCharArray();
            Arrays.sort(subChars);

            if (Arrays.equals(s1Chars, subChars)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "onetwofour";
        String s2 = "hellofourtwooneworld";

        System.out.println(isShuffleSubstring(s1, s2)); // Output: true
    }
}
