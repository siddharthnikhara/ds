package com.example.string;

public class LongestRepeatingCharacterReplacement1 {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A'] += 1;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A'] -= 1;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int k = 2;
        String A = "AABABBA";
        System.out.println(characterReplacement(A, k));
        k = 4;
        String B = "HHHHHH";
        System.out.println(characterReplacement(B, k));
    }
}