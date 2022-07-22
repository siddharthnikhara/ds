package com.example.stackPractice;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        prefixToInfix(s);
    }

    static void prefixToInfix(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c=s.charAt(i);
            if (isOperator(c)) {
                String ch1 = stack.pop();
                String ch2 = stack.pop();
                String temp = "(" + ch1 +c + ch2 + ")";
                stack.push(temp);
            } else {
                stack.push(c+"");
            }
        }
        System.out.println(stack.pop());
    }

    static boolean isOperator(char ch) {
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }
}