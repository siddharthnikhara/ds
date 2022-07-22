package com.example.stackPractice;

public class MergableOf2Stackp {
    public static void main(String[] args) {
        Stack ms1 = new Stack();
        Stack ms2 = new Stack();
        ms1.push(6);
        ms1.push(5);
        ms1.push(4);
        ms2.push(9);
        ms2.push(8);
        ms2.push(7);
         ms2.pop();
        ms1.merge(ms2);
        //ms1.display();
    }

    static class Stack {
        Node head;
        Node tail;

        void push(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
                tail=node;
            } else {
                node.prev = tail;
                tail.next = node;
                tail = node;
            }
        }

        int pop() {
            if (head == null) {
                System.out.println("underflow");
                return -1;
            }
            if (head == tail) {
                int top = head.data;
                head = null;
                tail = null;
                return top;
            }
            int top = tail.data;
            tail = tail.prev;
            return top;
        }

        void merge(Stack s1) {
            head.prev = s1.tail;
            s1.tail.next = head;
        }
    }

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
