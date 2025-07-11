package com.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class SecondNonRepeatingCharIndex {

    public static int findSecondNonRepeatingCharIndex(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the HashMap with character counts using streams
        str.chars().forEach(c -> charCount.put((char) c, charCount.getOrDefault((char) c, 0) + 1));

        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> charCount.get(c) == 1)
                .skip(1) // Skip the first non-repeating character
                .findFirst()
                .map(c -> str.indexOf(c))
                .orElse(-1);
    }

    public static void main(String[] args) {
        String str = "geekkss";
        int index = findSecondNonRepeatingCharIndex(str);
        if (index != -1) {
            System.out.println("Index of the second non-repeating character: " + index);
        } else {
            System.out.println("No second non-repeating character found.");
        }
    }
}
