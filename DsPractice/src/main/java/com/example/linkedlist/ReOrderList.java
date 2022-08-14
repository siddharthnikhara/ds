package com.example.linkedlist;

public class ReOrderList {
    static class LinkedList {

        static Node head;

        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        void printlist(Node node) {
            if (node == null) {
                return;
            }
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
        }

        Node reverselist(Node head) {
            if (head == null || head.next == null) {
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

        void rearrange(Node node) {

            Node slow = node, fast = node;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node node1 = node;
            Node node2 = slow.next;
            slow.next = null;

            node2 = reverselist(node2);

            node = new Node(0);

            Node curr = node;
            while (node1 != null || node2 != null) {

                if (node1 != null) {
                    curr.next = node1;
                    curr = curr.next;
                    node1 = node1.next;
                }

                if (node2 != null) {
                    curr.next = node2;
                    curr = curr.next;
                    node2 = node2.next;
                }
            }
            node = node.next;
        }

        public static void main(String[] args) {

            LinkedList list = new LinkedList();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);
            list.head.next.next.next.next = new Node(5);

            list.printlist(head);
            list.rearrange(head);
            System.out.println("");
            list.printlist(head);
        }
    }
}