package com.example.stack;

public class StackLinkedListShradha {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static boolean isEmpty(){
        return head==null;
    }
    static void push(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head=node;
            return;
        }else{
            node.next=head;
            head=node;
        }
    }
    static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    static int peek(){
        if(isEmpty()){
            return -1;
        }
        int top= head.data;
        return top;
    }
    public static void main(String[] args) {
        StackLinkedListShradha stack1 = new StackLinkedListShradha();
       // stack1.pop();
        stack1.push(1);
        stack1.push(2);
        //stack1.pop();
        stack1.peek();
        Node node = StackLinkedListShradha.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}