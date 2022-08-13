package com.example.linkedlist;

public class ReversedIterativeLinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node head) {
        if(head ==null || head.next == null){
            return head;
        }
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            Node next = current.next;
            current.next = prev;

            //update
            prev = current;
            current = next;
        }
        head.next = null;
        head = prev;
        return head;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReversedIterativeLinkedList list = new ReversedIterativeLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}