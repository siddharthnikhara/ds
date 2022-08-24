package com.example.binarySearchTree;

public class MinimumMaximumElementInBST {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node buildTree(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = buildTree(root.left, val);
        } else {
            root.right = buildTree(root.right, val);
        }
        return root;
    }

    static int minValue(Node node) {
        if (node == null) {
            return -1;
        }
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    static int maxValue(Node node) {
        if (node == null) {
            return -1;
        }
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public static void main(String[] args) {
        MinimumMaximumElementInBST tree = new MinimumMaximumElementInBST();
        tree.root = buildTree(tree.root, 4);
        buildTree(tree.root, 2);
        buildTree(tree.root, 1);
        buildTree(tree.root, 3);
        buildTree(tree.root, 6);
        buildTree(tree.root, 5);
        System.out.println("Minimum value of BST is " + minValue(tree.root));
        System.out.println("Minimum value of BST is " + maxValue(tree.root));
    }
}
