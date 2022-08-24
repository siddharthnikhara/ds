package com.example.binarySearchTree;

import java.util.ArrayList;
import java.util.List;


public class CountPairsTwoBSTSumEqualToX {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node root1;
    static Node root2;
    static int count = 0;
    static List<Node> l = new ArrayList<>();

    static int countPairs(Node root1, Node root2, int x) {
        if (root1 == null || root2 == null)
            return 0;
        inorder(root1);
        for (Node n : l) {
            int key = Math.abs(n.data - x);
            findPair(root2, key);
        }
        return count;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        l.add(root);
        inorder(root.right);
    }

    static boolean findPair(Node n, int key) {
        if (n == null) {
            return false;
        }
        if (n.data > key) {
            return findPair(n.left, key);
        } else if (n.data == key) {
            count++;
            return true;
        } else {
            return findPair(n.right, key);
        }
    }

    public static void main(String args[]) {
        root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);
        int x = 16;

        System.out.println("Pairs = " + countPairs(root1, root2, x));
    }
}