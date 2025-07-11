package com.example.string;

public class LongestSubstringWithoutRepeatingChar1 {

    public static String longestUniqueSubsttr(String str) {
        String test = "";
        int maxLength = -1;
        if (str.isEmpty()) {
            return "";
        } else if (str.length() == 1) {
            return str;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            test = test + current;
            maxLength = Math.max(test.length(), maxLength);
        }
        return test;
    }

    public static void main(String[] args) {
        String str = "dvdertyuif";
        System.out.println("The input string is " + str);
        String len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest non-repeating character substring is " + len);
    }
}