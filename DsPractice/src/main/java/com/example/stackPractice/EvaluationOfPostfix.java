package com.example.stackPractice;

import java.util.Stack;

public class EvaluationOfPostfix {
    public static void main(String[] args) {
        String str = "231*+9-";
        Stack<Integer> stack = new Stack<>();
        int i, n = str.length();
        for (i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c-'0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}