package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class ShuffleSubstringWithMap {

    public static boolean containsPermutation(String A, String B) {
        if (B.length() > A.length()) return false;

        Map<Character, Integer> bMap = buildCharFrequency(B);
        Map<Character, Integer> windowMap = new HashMap<>();

        int windowSize = B.length();

        for (int i = 0; i < A.length(); i++) {
            // Add current character to the window map
            char current = A.charAt(i);
            windowMap.put(current, windowMap.getOrDefault(current, 0) + 1);

            // Remove character that falls out of the window
            if (i >= windowSize) {
                char outChar = A.charAt(i - windowSize);
                windowMap.put(outChar, windowMap.get(outChar) - 1);
                if (windowMap.get(outChar) == 0) {
                    windowMap.remove(outChar); // cleanup
                }
            }

            // Compare maps
            if (windowMap.equals(bMap)) {
                return true;
            }
        }

        return false;
    }

    // Helper method to build frequency map of characters
    private static Map<Character, Integer> buildCharFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String A = "eidbaooo";
        String B = "ab";

        System.out.println(containsPermutation(A, B) ? "YES" : "NO");
    }
}
