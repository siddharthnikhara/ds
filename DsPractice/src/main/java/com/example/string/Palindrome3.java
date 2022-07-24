package com.example.string;

import java.util.*;

public class Palindrome3 {
    static boolean sentencePalindrome(String s) {
        s =s.toLowerCase();
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(str[i]))
                stack.push(str[i]);
        }
        String string = "";
        String reverse = "";
        for (Character character : stack) {
            string += character;
        }
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }
        return string.equals(reverse);
    }

    public static void main(String[] args) {
        String str = "Too hot to hoot.";
        if (sentencePalindrome(str)) {
            System.out.println("Sentence is palindrome");
        } else {
            System.out.println("Sentence is not" + " " + "palindrome");
        }
    }
}
