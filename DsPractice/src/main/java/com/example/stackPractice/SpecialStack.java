package com.example.stackPractice;

import java.util.Stack;

class SpecialStack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();

    void push(int x) {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        } else {
            super.push(x);
            int mini =min.peek();
            if (x <= mini)
                min.push(x);
        }
    }

    public Integer pop() {
        int x = super.pop();
        int mini = min.pop();
        if (mini != x)
            min.push(mini);
        return x;
    }

    int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        //System.out.println(s.pop());
        s.push(5);
        System.out.println(s.getMin());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.getMin());
    }
}