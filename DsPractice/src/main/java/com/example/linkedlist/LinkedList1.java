package com.example.linkedlist;

public class LinkedList1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList1 insert(LinkedList1 list, int data) {
        Node node = new Node(data);
        node.next = null;
        if (list.head == null) {
            list.head = node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return list;
    }

    public static void display(LinkedList1 list) {
        Node node = list.head;
        while (node != null) {
            System.out.println("" + node.data);
            node = node.next;
        }
    }

    public static LinkedList1 deleteByKey(LinkedList1 list, int key) {
        Node curr_node = list.head;
        Node prev = null;
        if (curr_node != null && curr_node.data == key) {
            list.head = curr_node.next;
            return list;
        }
        while (curr_node != null && curr_node.data != key) {
            prev = curr_node;
            curr_node = curr_node.next;
        }
        if (curr_node != null) {
            prev.next = curr_node.next;
        }
        if (curr_node == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

    public static LinkedList1 deleteAtPosition(LinkedList1 list, int index) {
        LinkedList1.Node currNode = list.head, prev = null;
        if (index == 0 && currNode != null) {
            list.head = currNode.next;
            System.out.println(index + " position element deleted");
            return list;
        }
        int counter = 0;
        while (currNode != null) {

            if (counter == index) {
                prev.next = currNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(index + " position element not found");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        display(list);
        deleteByKey(list,7);
        deleteAtPosition(list,4);
        display(list);
    }
}