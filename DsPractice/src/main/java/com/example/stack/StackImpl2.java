package com.example.stack;

import java.util.ArrayList;

public class StackImpl2 {

    static class Stack {
        ArrayList<Integer> list = new ArrayList();

        boolean isEmpty() {
            return list.size() == 0;
        }

        void push(int data) {
            list.add(data);
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            return list.remove(list.size() - 1);

        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        StackImpl2.Stack stack1 = new StackImpl2.Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();
        System.out.println(stack1.peek() + " peek");

    }
}