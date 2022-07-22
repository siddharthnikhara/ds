package com.example.stackPractice;

public class MergableOf2StackPractice {

   static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }
    static class Stack{
        Node head;
        Node tail;

        void push(int data){
            Node node = new Node(data);
            if(head==null){
                head=node;
                tail=node;
            }else{
                node.prev=tail;
                tail.next=node;
                tail=node;
            }
        }
        void pop(){
            if(head==null){
                System.out.println("underflow");
                return;
            }if(head==tail){
                head=null;
                tail=null;
            }else{
                Node n=tail;
                tail=tail.prev;
                n.prev=null;
                tail.next=null;
            }
        }
        void merge(Stack s){
            head.prev=s.tail;
            s.tail.next=head;
            head=s.head;
            s.head=null;
            s.tail=null;
        }
        public void display() {
            if (tail != null) {
                Node n = tail;
                while (n != null) {
                    System.out.print(n.data + " ");
                    n = n.prev;
                }
                System.out.println();
            } else {
                System.out.println("Stack Underflow");
            }
        }

    }
    public static void main(String[] args) {
        MergableOf2StackPractice.Stack ms1 = new MergableOf2StackPractice.Stack();
        MergableOf2StackPractice.Stack ms2 = new MergableOf2StackPractice.Stack();

        ms1.push(6);
        ms1.push(5);
        ms1.push(4);
        ms2.push(9);
        ms2.push(8);
        ms2.push(7);
        //ms2.pop();
        ms1.merge(ms2);
        ms1.display();
    }
}