package com.example.string;

public class Palindrome2 {
    static boolean sentencePalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        String rstr = revstr.toString();
        if (str.equals(rstr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Too hot to hoot.";
        if (sentencePalindrome(str)) {
            System.out.println("Sentence is palindrome");
        }
        else {
            System.out.println("Sentence is not" + " " + "palindrome");
        }
    }
}
