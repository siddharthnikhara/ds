package com.example.linkedlist;

public class DeleteNodeGreaterValueRightSide {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        Node newNode = null;
        for (int i = 1; i < arr.length; i++) {
            newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node deleteNodesOnRightSide(Node head) {
        if (head == null || head.next == null) return head;
        Node nextNode = deleteNodesOnRightSide(head.next);

        if (nextNode.data > head.data) return nextNode;
        head.next = nextNode;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 10, 11, 5, 6, 2, 3};
        DeleteNodeGreaterValueRightSide llu = new DeleteNodeGreaterValueRightSide();
        Node res = llu.createLL(arr);
        System.out.println("Given Linked List");
        llu.printLL(res);
        res = deleteNodesOnRightSide(res);
        System.out.println("Modified Linked List");
        llu.printLL(res);
    }
}
