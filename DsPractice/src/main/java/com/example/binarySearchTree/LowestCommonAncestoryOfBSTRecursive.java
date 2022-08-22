package com.example.binarySearchTree;

import com.example.tree.BinarySearchTreePractice;

public class LowestCommonAncestoryOfBSTRecursive {

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

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root.data < p.data && root.data < q.data) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.data > p.data && root.data > q.data) {
            return lowestCommonAncestor(root.left, p, q);
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
}//space complexity in O(n)
