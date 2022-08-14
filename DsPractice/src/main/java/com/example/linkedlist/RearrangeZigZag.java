package com.example.linkedlist;

public class RearrangeZigZag {
    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void printLL() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ->");
            t = t.next;
        }
    }

    public void swap(Node a, Node b) {
        if (a == null || b == null) {
            return;
        }
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    public Node zigZag(Node node, int flag) {
        if (node == null || node.next == null) {
            return node;
        }
        if (flag == 0) {
            if (node.data > node.next.data) {
                swap(node, node.next);
            }
            return zigZag(node.next, 1);
        } else {
            if (node.data < node.next.data) {
                swap(node, node.next);
            }
            return zigZag(node.next, 0);
        }
    }

    public static void main(String[] args) {
        RearrangeZigZag lobj = new RearrangeZigZag();
        lobj.head = new Node(11);
        lobj.head.next = new Node(15);
        lobj.head.next.next = new Node(20);
        lobj.head.next.next.next = new Node(5);
        lobj.head.next.next.next.next = new Node(10);
        lobj.printLL();

        int flag = 0;
        lobj.zigZag(lobj.head, flag);
        System.out.println("LL in zig zag fashion : ");
        lobj.printLL();
    }
}
