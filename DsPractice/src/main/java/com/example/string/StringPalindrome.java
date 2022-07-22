package com.example.string;

public class StringPalindrome {
    static boolean sentencePalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        String str = s.toLowerCase();

        //remove non-alphanumeric characters
        // replace the given string with empty string except the pattern [^a-zA-Z0-9]
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        String rstr = revstr.toString();

        if (str.equals(rstr)) {
            return true;
        }
        return false;

    }
}