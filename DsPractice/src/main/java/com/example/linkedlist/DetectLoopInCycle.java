package com.example.linkedlist;

public class DetectLoopInCycle {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    boolean detectLoop() {
        Node slow_p = head, fast_p = head;
        boolean flag = false;
        while (slow_p != null && fast_p != null  && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        DetectLoopInCycle llist = new DetectLoopInCycle();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;
        System.out.println(llist.detectLoop());
    }
}