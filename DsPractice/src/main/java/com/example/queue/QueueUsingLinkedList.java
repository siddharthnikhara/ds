package com.example.queue;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        void push(int data) {
            Node node = new Node(data);
            if (tail == null) {
                tail = head = node;
            }
            tail.next = node;
            tail = node;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            int x = head.data;
            if (tail == head) {
                head = tail = null;
            }
            head = head.next;
            return x;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }
    }
}