package com.example.string;

public class Palindrome2 {
    static boolean sentencePalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rstr = new StringBuffer(s).reverse().toString();
        if (s.equals(rstr)) {
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
