package com.example.linkedlist;

public class RemoveAndDetectLoopInCycle {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static boolean detectAndRemoveLoop() {
        Node slow = head, fast = head;
        boolean flag = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (slow == fast) {
            slow = head;
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            slow.next = fast.next.next;
            fast.next = null;
        }

        return flag;
    }

    void printList() {
        Node node = head;
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        RemoveAndDetectLoopInCycle list = new RemoveAndDetectLoopInCycle();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(6);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(4);
        list.head.next.next.next.next.next = new Node(5);

        // Creating a loop for testing
        head.next.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop();
        System.out.println("Linked List after removing loop : ");
        list.printList();
    }
}