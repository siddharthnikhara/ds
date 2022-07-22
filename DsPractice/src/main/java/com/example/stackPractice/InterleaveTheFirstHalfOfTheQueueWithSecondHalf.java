package com.example.stackPractice;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveTheFirstHalfOfTheQueueWithSecondHalf {
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        interleaveTheFirstHalfOfTheQueueWithSecondHalf(q);

    }

    static void interleaveTheFirstHalfOfTheQueueWithSecondHalf(Queue q){
        int mid =q.size()/2;
        Queue newQ = new LinkedList<Integer>();
        int idx=q.size();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i<mid;i++){
            pushAtBottom1(stack, (Integer) q.remove());
        }
        for(int i =0;i<idx;i++){
            if(i%2==0){
                newQ.add(stack.pop());
            }else{
                newQ.add(q.remove());
            }
        }
        for(int i=0;i<idx;i++){
            System.out.print(newQ.remove()+" ");
        }
    }
    static void pushAtBottom1(Stack<Integer> s,int a){
        if(s.isEmpty()){
            s.push(a);
            return;
        }
        int data = s.pop();
        pushAtBottom1(s,a);
        s.push(data);
    }
}