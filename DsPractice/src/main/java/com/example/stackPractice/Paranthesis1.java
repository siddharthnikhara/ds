package com.example.stackPractice;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis1 {
    public static void main(String[] args) {
        int length = 0, i;
        char c;
        Stack<Character> stack = new Stack<Character>();
        String exp = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter expression");
       exp = scanner.nextLine();
        length = exp.length();
        for (i = 0; i < length; i++) {
            c = exp.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    System.out.println("unbalanced");
                    return;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    System.out.println("unbalanced");
                    return;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    System.out.println("unbalanced");
                    return;
                }
            }

        }
        if(stack.isEmpty()){
            System.out.println("balanced");
        }
    }
}