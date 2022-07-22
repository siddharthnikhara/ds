package com.example.stack;

public class StackLinkedList {
    StackNode head;
    class StackNode{
        int data;
        StackNode next;
        StackNode(int d){
            data =d;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data){
        StackNode stackNode = new StackNode(data);
        if(head==null){
            head=stackNode;
        }else{
            StackNode temp = head;
            head = stackNode;
            stackNode.next = temp;
        }
    }
    public int pop(){
        int popped = Integer.MIN_VALUE;
        if(head==null){
            System.out.println("stack is empty");
        }else{
            popped=head.data;
            head = head.next;
        }
        return popped;
    }

    public int peek(){
        if(head==null){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }else{
           return head.data;
        }
    }
}
