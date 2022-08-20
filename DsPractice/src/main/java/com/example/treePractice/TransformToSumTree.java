package com.example.treePractice;

public class TransformToSumTree {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int old = root.data;
        root.data = sum(root.left) + sum(root.right);
        return root.data + old;
    }

    static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        if (root.data != 0) {
            System.out.print(root.data + " ");
        }
        printInorder(root.right);
    }

    public static void main(String args[]) {
        TransformToSumTree tree = new TransformToSumTree();
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);

        tree.sum(tree.root);

        System.out.println("Inorder Traversal of the resultant tree is:");
        tree.printInorder(tree.root);
    }
}
