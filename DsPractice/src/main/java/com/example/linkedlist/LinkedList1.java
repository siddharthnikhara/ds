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
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList1 list = new LinkedList1();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList1
        display(list);
    }

    public static LinkedList1 deleteByKey(LinkedList1 list, int key){
        Node curr_node=list.head;
        Node prev = null;
        if(curr_node!=null && curr_node.data==key){
            list.head = curr_node.next;
            return list;
        }
        while(curr_node!=null && curr_node.data!=key){
            prev=curr_node;
            curr_node=curr_node.next;
        }
        if(curr_node!=null){
            prev.next=curr_node.next;
        }
        // If key was not present in linked list
        // currNode should be null
        if (curr_node == null) {
            // Display the message
            System.out.println(key + " not found");
        }
        return list;
    }
}