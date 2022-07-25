package com.example.stackPractice;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
    System.out.println(infixToPostfix("(x/y-a+c*b/e^f)"));
    }

    public static int prec(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        char c;
        String result="";
        for (int i = 0; i < length; ++i) {
            c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result=result+c;
            }
            else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek()!='('){
                    result +=stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && prec(c)<=prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
            while (!stack.isEmpty()) {
                if (stack.peek() == '(') {
                    return "Invalid expression";
                }else{
                    result += stack.pop();
                }
            }
        return result;
    }
}