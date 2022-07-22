package com.example.linkedlist;

public class LinkedListPractice {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedListPractice insert(LinkedListPractice listPractice, int key) {
        Node newNode = new Node(key);
        newNode.next = null;
        if (listPractice.head == null) {
            listPractice.head = newNode;
        } else {
            Node last = listPractice.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return listPractice;
    }

    public static void display(LinkedListPractice linkedListPractice) {
        Node cunode = linkedListPractice.head;
        while (cunode != null) {
            System.out.print(cunode.data + " ");
            cunode = cunode.next;
        }
    }

    public static LinkedListPractice deleteByKey(LinkedListPractice linkedListPractice, int key) {
        Node node = linkedListPractice.head;
        Node prev = null;
        if (node != null && node.data == key) {
            linkedListPractice.head = node.next;
            return linkedListPractice;
        }
        while (node != null && node.data != key) {
            prev = node;
            node = node.next;
        }
        if (node != null) {
            prev.next = node.next;
        }
        if (node == null) {
            System.out.println(key + " not found in linked list");
        }
        return linkedListPractice;
    }

    public static LinkedListPractice deleteAtPosition(LinkedListPractice listPractice, int position) {
        Node node = listPractice.head;
        Node prev = null;
        if (node != null && position == 0) {
            listPractice.head = node.next;
            return listPractice;
        }
        int counter = 0;
        while (node != null) {
            if (position == counter) {
                prev.next = node.next;
                break;
            } else {
                prev = node;
                node = node.next;
                counter++;
            }
        }
        if (node == null) {
            System.out.println(position + "not found in linked list");
        }
        return listPractice;
    }

    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        display(list);
        deleteByKey(list, 4);
        display(list);
    }

}