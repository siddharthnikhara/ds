package com.example.stackPractice;

public class ImplementStackAndQueueUsingDoubleEndedQueue {

    static class DeQueueNode {
        int value;
        DeQueueNode next;
        DeQueueNode prev;
    }
    static class deque{
        private DeQueueNode head;
        private DeQueueNode tail;
        public deque(){
            head=tail=null;
        }
        boolean isEmpty(){
            return head==null;
        }
        int size(){
            if(!isEmpty()){
                DeQueueNode temp=head;
                int len=0;
                while (temp!=null){
                    len++;
                    temp=temp.next;
                }return len;
            }
            return 0;
        }
        void insertFirst(int element){
            DeQueueNode node = new DeQueueNode();
            node.value=element;
            if(head==null){
                head=tail=node;
            }else{
                head.prev=node;
                node.next=head;
                node.prev=null;
                head=node;
            }
        }
        void insertLast(int element){
            DeQueueNode node = new DeQueueNode();
            node.value=element;
            if(head==null){
                head=tail=null;
            }else{
                tail.next=node;
                node.prev=tail;
                node.next=null;
                tail=node;
            }
        }
        void removeFirst(){
            if(!isEmpty()){
                DeQueueNode node  =head;
                head=head.next;
                head.prev=null;
                return;
            }
            System.out.println("list is empty");
        }
        void removeLast(){
            if(!isEmpty()){
                DeQueueNode node =tail;
                tail=tail.prev;
                tail.next=null;
                return;
            }
            System.out.println("list is empty");
        }
        void display(){
            if(!isEmpty()){
                DeQueueNode node = head;
                while (node!=null){
                    System.out.print(node.value+" ");
                    node = node.next;
                }return;
            }
            System.out.println("list is empty");
        }
    }
    static class Stack{
        deque d = new deque();
        void push(int element){
            d.insertLast(element);
        }
        int size(){
            return d.size();
        }
        void pop(){
            d.removeLast();
        }
        void display(){
            d.display();
        }
    }
    static class Queue{
        deque d = new deque();
        void push(int element){
            d.insertLast(element);
        }
        int size(){
            return d.size();
        }
        void pop(){
            d.removeFirst();
        }
        void display(){
            d.display();
        }
    }
}
