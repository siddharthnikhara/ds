package com.example.string;

public class Palindrome1 {
    static boolean sentencePalindrome(String str) {
        int l = 0;
        int h = str.length() - 1;
        str = str.toLowerCase();
        while (l <= h) {
            char left = str.charAt(l);
            char right = str.charAt(h);
            if (!(left >= 'a' && left <= 'z')) {
                l++;
            } else if (!(right >= 'a' && right <= 'z')) {
                h--;
            } else if (left == right) {
                l++;
                h--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Too hot to htoot.";
        if (sentencePalindrome(str)) {
            System.out.println("Sentence is palindrome");
        } else {
            System.out.println("Sentence is not" + " " +"palindrome");
        }
    }
}