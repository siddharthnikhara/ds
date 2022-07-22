package com.example.queue;

public class QueueUsingArray {
    static class Queue{
        static int arr[];
        static int rear=-1;
        static int size;
        Queue(int size){
            arr = new int[size];
            this.size=size;
        }
        static boolean isEmpty(){
            return rear==-1;
        }
        static void add(int data){
            if(rear>=size){
                System.out.print("overflow");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        static int remove(){
            if(isEmpty()){
                System.out.print("queue empty");
                return -1;
            }
            int r = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return r;
        }
        static int front(){
            if(isEmpty()){
                System.out.print("queue empty");
                return -1;
            }
           return arr[0];
        }
        public static void main(String[] args) {
            Queue q = new Queue(100);
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