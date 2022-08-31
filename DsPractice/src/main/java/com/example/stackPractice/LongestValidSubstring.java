package com.example.stackPractice;

import java.util.Stack;

public class LongestValidSubstring {
    public static void main(String[] args) {
        String s = "())(()))))";
        int size = 0;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (c == ')' && stack.peek() == '(') {
                        size++;
                        stack.pop();
                    }
                }
            }
        }
        System.out.println(size*2);
    }
}