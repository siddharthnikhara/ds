package com.example.queue;

public class QueueP {
    int arr[];
    int size;
    int rear=-1;
    QueueP(int n){
        arr= new int[n];
        size=n;
    }
    boolean isEmpty(){
        return rear==-1;
    }
    void push(int data){
        if(rear>=size-1){
            System.out.println("overflow");
            return;
        }
        arr[++rear]=data;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        int top=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return top;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        return arr[0];
    }
    public static void main(String[] args) {
        QueueP q = new QueueP(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
