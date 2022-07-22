package com.example.stackPractice;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public static boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        public static void add(int data) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public static int remove() {
            if (stack1.isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return stack1.pop();
        }

        public static int peek() {
            if (stack1.isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return stack1.peek();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}