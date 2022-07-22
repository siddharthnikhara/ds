package com.example.stackPractice;

import java.util.Stack;

public class SpecialStackPractice extends Stack {
    Stack stack = new Stack();
    void push(int data){
        if(isEmpty()){
            super.push(data);
            stack.push(data);
        }else{
            super.push(data);
            int mini= (int)stack.peek();
            if(data<=mini){
                stack.push(data);
            }
        }
    }
    int remove(){
        int x=(int)super.pop();
        int mini=(int)stack.pop();
        if(mini!=x){
            stack.push(mini);
        }
        return x;
    }
    int getMin(){
        return (int)stack.peek();
    }
    public static void main(String[] args) {
        SpecialStackPractice s = new SpecialStackPractice();
        s.push(10);
        s.push(20);
        s.push(30);
        //System.out.println(s.pop());
        s.push(5);
        System.out.println(s.getMin());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.getMin());
    }
}