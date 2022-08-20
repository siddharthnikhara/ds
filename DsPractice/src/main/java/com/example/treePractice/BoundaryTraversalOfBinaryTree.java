package com.example.treePractice;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalOfBinaryTree {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void traverseLeft(Node root, List<Integer> list) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        list.add(root.data);
        if (root.left != null) {
            traverseLeft(root.left, list);
        } else {
            traverseLeft(root.right, list);
        }

    }

    static void traverseLeaf(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.data);
        }
        traverseLeaf(root.left, list);
        traverseLeaf(root.right, list);
    }

    static void traverseRight(Node root, List<Integer> list) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        if (root.right != null) {
            traverseRight(root.right, list);
        } else {
            traverseRight(root.left, list);
        }
        list.add(root.data);
    }

    static List<Integer> boundary(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.data);
        traverseLeft(root.left, list);
        traverseLeaf(root.left, list);
        traverseLeaf(root.right, list);
        traverseRight(root.right, list);
        return list;
    }

    public static void main(String[] args) {
        BoundaryTraversalOfBinaryTree tree = new BoundaryTraversalOfBinaryTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(3);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.right.right = new Node(9);
        System.out.println(boundary(tree.root));

    }

}
