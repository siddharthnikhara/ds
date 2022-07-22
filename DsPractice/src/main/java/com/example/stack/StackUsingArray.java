package com.example.stack;

public class StackUsingArray {
    static final int MAX=2000;
    int top;
    int a[] =new int[MAX];
    StackUsingArray(){
        top=-1;
    }
    public boolean isEmpty(){
        return (top<0);
    }
    public boolean push(int x){
        if(top>=MAX-1){
            System.out.println("stack overflow");
            return false;
        }else{
            a[++top] =x;
            System.out.println("element inserted"+x);
            return true;
        }
    }
    public int pop(){
        if(top<0){
            System.out.println("stack underflow");
            return 0;
        }else{
            int x =a[top--];
            System.out.println("element pop"+x);
            return x;
        }
    }
    public int peek(){
        if(top<0){
            System.out.println("stack underflow");
            return 0;
        }else{
            int x =a[top];
            System.out.println("element at peek"+x);
            return x;
        }
    }
    public void display(){
        for(int i=top;i>-1;i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack1 = new StackUsingArray();
        stack1.pop();
        stack1.push(1);
        stack1.push(2);
        System.out.println(stack1.isEmpty());
        stack1.display();
        stack1.push(3);
        stack1.display();
        stack1.pop();
        stack1.peek();
    }
}
