package com.example.stackPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKthElement1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        queue=reversekthElement(queue,k);
        System.out.println(queue);
    }
    static Queue reversekthElement(Queue q, int k){
        if(q.isEmpty() || k>q.size()){
            return null;
        }
        Stack stack = new Stack();
        for(int i=0;i<k;i++){
            stack.push(q.peek());
            q.remove();
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}