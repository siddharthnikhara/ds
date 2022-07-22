package com.example.stack;

public class StackImpl1 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean isEmpty() {
        return head == null;
    }

    static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackImpl1 stack1 = new StackImpl1();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1.peek() + " peek");
        StackImpl1.Node node = StackImpl1.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
