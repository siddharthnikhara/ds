package com.example.linkedlist;

public class SortLinkedListOf0s1s2s {
    static LinkedList.Node head;

    static class LinkedList {

        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
            }
        }

        void sortList() {
            int count[] = {0, 0, 0};

            Node ptr = head;

            while (ptr != null) {
                count[ptr.data]++;
                ptr = ptr.next;
            }

            int i = 0;
            ptr = head;

            while (ptr != null) {
                if (count[i] == 0)
                    i++;
                else {
                    ptr.data = i;
                    --count[i];
                    ptr = ptr.next;
                }
            }
        }

        private static void insertTheTail(Node tail, Node temp) {
            tail.next = temp;
            tail = temp;
        }

        public static void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        static void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        LinkedList llist = new LinkedList();

        llist.push(0);
        llist.push(1);
        llist.push(0);
        llist.push(2);
        llist.push(1);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(2);

        System.out.println("Linked List before sorting");
        llist.printList();

        llist.sortList();

        System.out.println("Linked List after sorting");
        llist.printList();
    }
}