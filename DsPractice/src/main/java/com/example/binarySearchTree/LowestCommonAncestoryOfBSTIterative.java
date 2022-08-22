package com.example.binarySearchTree;

public class LowestCommonAncestoryOfBSTIterative {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        while (root != null) {
            if (root.data < p.data && root.data < q.data) {
                root = root.right;
            } else if (root.data > p.data && root.data > q.data) {
                root = root.left;
            } else {
                break;
            }
        }
        return root;
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

    public static void main(String[] args) {
        int[] keys = {15, 10, 20, 8, 12, 16, 25};

        /* Construct the following tree
                  15
                /   \
               /     \
              10     20
             / \     / \
            /   \   /   \
           8    12 16   25
        */

        Node root = null;
        for (int key : keys) {
            root = buildTree(root, key);
        }
        System.out.println(lowestCommonAncestor(root, root.right.right, root.right).data);
    }
}
