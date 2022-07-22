package com.example.stackPractice;

import java.util.Stack;

public class StackPushAtBottom {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
//        pushAtBottom(s,4);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    static void pushAtBottom(Stack s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int result = (int) s.pop();
        pushAtBottom(s, data);
        s.push(result);
    }


    public static void reverse(Stack s){
        if(s.isEmpty()){
            return;
        }
        int data = (int)s.pop();
        reverse(s);
        pushAtBottom(s,data);
    }
}