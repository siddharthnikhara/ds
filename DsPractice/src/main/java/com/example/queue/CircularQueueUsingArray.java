package com.example.queue;

public class CircularQueueUsingArray {

    static class Queue{
        static int arr[];
        static int rear=-1;
        static int front =-1;
        static int size;
        Queue(int size){
            arr = new int[size];
            this.size=size;
        }
        static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        static boolean isFull(){
            return (rear+1)%size==front;
        }
        static void add(int data){
            if(isFull()){
                System.out.print("overflow");
                return;
            }
            //1st element add
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        static int remove(){
            if(isEmpty()){
                System.out.print("queue empty");
                return -1;
            }
            int r = arr[front()];
            if(rear==front){
                rear=front=-1;
            }else {
                front =(front+1)%size;
            }
            return r;
        }
        static int front(){
            if(isEmpty()){
                System.out.print("queue empty");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args) {
            QueueUsingArray.Queue q = new QueueUsingArray.Queue(100);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            while (!q.isEmpty()){
                System.out.println(q.front());
                q.remove();
            }
        }
    }
}