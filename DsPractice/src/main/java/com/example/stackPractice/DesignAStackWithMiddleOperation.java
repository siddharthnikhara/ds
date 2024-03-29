package com.example.stackPractice;

public class DesignAStackWithMiddleOperation {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static class MyStack {
        Node mid;
        Node node;
        int size;

        void push(int data) {
            Node newNode = new Node(data);
            if (size == 0) {
                node = newNode;
                mid = newNode;
                size++;
                return;
            }
            node.next = newNode;
            newNode.prev = node;
            node = node.next;
            if (size % 2 == 0) {
                mid = mid.next;
            }
            size++;
        }

        int pop() {
            int data = -1;
            if (size == 0) {
                return -1;
            }
            if (size != 0) {
                if (size == 1) {
                    data = node.data;
                    node = null;
                    mid = null;
                } else {
                    data = node.data;
                    node = node.prev;
                    node.next = null;
                    if (size % 2 != 0) {
                        mid = mid.prev;
                    }
                }
                size--;
            }
            return data;
        }

        int findMiddle() {
            if (size == 0) {
                System.out.println("Stack is empty now");
                return -1;
            }
            return mid.data;
        }
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);

        // System.out.println("Popped : " + ms.pop());
        // System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : "
                + ms.findMiddle());
    }
}
