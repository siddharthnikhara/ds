package com.example.linkedlist;

public class DeleteNthNodeFromEndLinkedList {
    static class LinkedList {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        void deleteNode(int key) {

            Node first = head;

            Node second = head;
            for (int i = 0; i < key; i++) {
                if (second.next == null) {
                    if (i == key - 1)
                        head = head.next;
                    return;
                }
                second = second.next;
            }

            while (second.next != null) {
                first = first.next;
                second = second.next;
            }

            first.next = first.next.next;
        }

        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        public void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }

        public static void main(String[] args) {
            LinkedList llist = new LinkedList();

            llist.push(7);
            llist.push(1);
            llist.push(3);
            llist.push(2);

            System.out.println("\nCreated Linked list is:");
            llist.printList();

            int N = 1;
            llist.deleteNode(N);

            System.out.println("\nLinked List after Deletion is:");
            llist.printList();
        }
    }
}