package com.example.stackPractice;

public class TwoStackUsingAnArray {
    int arr[];
    int size;
    int top1, top2;
    TwoStackUsingAnArray(int n){
        arr = new int[n];
        size=n;
        top1=-1;
        top2=size;
    }
    public void push1(int data){

        if(top1<top2-1){
            arr[++top1]=data;
        }else{
            System.out.println("overfolw");
            System.exit(1);
        }
    }
    public void push2(int data){
        if(top1<top2-1){
            arr[--top2]=data;
        }else{
            System.out.println("overfolw");
            System.exit(1);
        }
    }
    int pop1(){
        if(top1>=0){
            int x = arr[top1];
            top1--;
            return x;
        }else{
            System.out.println("underflow");
            System.exit(1);
        }
        return -1;
    }
    int pop2(){
        if(top2<size){
            int x = arr[top2];
            top2++;
            return x;
        }else{
            System.out.println("underflow");
            System.exit(1);
        }
        return -1;
    }

    public static void main(String args[])
    {
        TwoStackUsingAnArray ts = new TwoStackUsingAnArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
    }

}
