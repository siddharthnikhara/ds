package com.example.treePractice;

public class SameTree {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        if (p.data == q.data && left && right) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SameTree tree = new SameTree();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);

        SameTree tree1 = new SameTree();
        tree1.root = new Node(2);
        tree1.root.left = new Node(3);
        tree1.root.right = new Node(4);
        System.out.println(tree.isSameTree(tree.root, tree1.root));
    }
}