package com.example.binarySearchTree;

public class CheckIfTreeIsBST {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node() {
        }

        Node(int data) {
            this.data = data;
        }
    }

    static void isBstTree(Node root, Node prev, boolean flag) {
        if (root == null) {
            return;
        }
        isBstTree(root.left, prev, flag);
        if (prev != null && root.data <= prev.data) {
            flag = false;
            return;
        }
        prev = root;
        isBstTree(root.right, prev, flag);
    }

    static boolean isBST(Node root) {
        boolean flag = true;
        Node prev = null;
        isBstTree(root, prev, flag);
        return flag;
    }

    public static void main(String args[]) {
        CheckIfTreeIsBST tree = new CheckIfTreeIsBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
