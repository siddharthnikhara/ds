package com.example.string;

public class PermutationInStringOptimal {

    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();

        if (len1 > len2) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Count frequency of characters in s1 and first window of s2
        for (int i = 0; i < len1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Check if first window matches
        if (matches(s1Count, windowCount)) return true;

        // Slide the window over s2
        for (int i = len1; i < len2; i++) {
            windowCount[s2.charAt(i) - 'a']++; // Add new character
            windowCount[s2.charAt(i - len1) - 'a']--; // Remove leftmost character

            if (matches(s1Count, windowCount)) return true;
        }

        return false;
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}
