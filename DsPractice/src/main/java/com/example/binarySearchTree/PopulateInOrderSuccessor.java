package com.example.binarySearchTree;

public class PopulateInOrderSuccessor {

    static class Node {
        int data;
        Node left, right, next;

        Node(int item) {
            data = item;
        }
    }

    static class BinaryTree {
        Node root;
        static Node next = null;

        void populateNext(Node node) {

            if (node != null) {
                populateNext(node.right);
                node.next = next;
                next = node;
                populateNext(node.left);
            }
        }

        public static void main(String args[]) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(10);
            tree.root.left = new Node(8);
            tree.root.right = new Node(12);
            tree.root.left.left = new Node(3);

            tree.populateNext(tree.root);
            Node ptr = tree.root.left.left;
            while (ptr != null) {
                int print = ptr.next != null ? ptr.next.data : -1;
                System.out.println("Next of " + ptr.data + " is: " + print);
                ptr = ptr.next;
            }
        }
    }
}