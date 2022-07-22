package com.example.stackPractice;

import java.util.Stack;

public class StackSortWithoutLoop {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(43);
        s.push(-3);
        s.push(23);
        sort(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    static void sort(Stack s){
        if(!s.isEmpty()){
            int temp=(int)s.pop();
            sort(s);
            sortedAtInsert(s,temp);
        }
    }
    static void sortedAtInsert(Stack s, int top){
        if(s.isEmpty()  || top>(int)s.peek()){
            s.push(top);
            return;
        }
        int tmp=(int)s.pop();
        sortedAtInsert(s,top);
        s.push(tmp);
    }
}