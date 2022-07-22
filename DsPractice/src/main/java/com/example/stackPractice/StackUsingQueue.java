package com.example.stackPractice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        static Queue q = new LinkedList();
        static Queue q1 = new LinkedList();

        public boolean isEmpty() {
            return q.isEmpty() && q1.isEmpty();
        }
        public void push(int data){
            while (!q.isEmpty()){
                q1.add(q.remove());
            }
            q.add(data);
            while (!q1.isEmpty()){
                q.add(q1.remove());
            }
        }
        int pop(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            return (int) q.remove();
        }
        int peek(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            return (int) q.peek();
        }

        public static void main(String[] args) {
            Stack stack = new Stack();
            stack.push(4);
            stack.push(3);
            stack.push(1);
            stack.push(10);
            stack.push(2);
            stack.push(6);
            while (!stack.isEmpty()){
                System.out.println(stack.peek());
                stack.pop();
            }
        }
    }
}