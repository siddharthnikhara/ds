package com.example.stackPractice;

import java.util.Stack;

public class DuplicateParanthesis {

    static boolean findDuplicateparenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                int top = stack.pop();
                int idx = 0;
                while (top != '(') {
                    idx++;
                    top = stack.pop();
                }
                if (idx < 1) {
                    return true;
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";
        if (findDuplicateparenthesis(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }
    }
}