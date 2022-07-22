package com.example.stackPractice;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        infixToPostfix("(A-B/C)*(A/K-L)");
    }

    static void infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        String newString = "";
        int i, length = s.length();
        for (i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                newString += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    newString += stack.pop();
                }
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if(prec(c) < prec(stack.peek())){
                        newString = stack.peek()+newString;
                        stack.pop();
                        stack.push(c);
                    }else{
                        char d = newString.charAt(newString.length()-1);
                         newString=newString.replace(d,c);
                         newString = newString+d;


                    }
                }
            }
        }
        while (!stack.isEmpty()){
            newString=stack.pop()+newString;
        }
        System.out.println(newString);
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
}
//*-A/BC-/AKL