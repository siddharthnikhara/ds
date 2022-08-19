package com.example.treePractice;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    static void invertBinaryTree(Node root) {
        Queue<Node> q = new LinkedList();
        Queue<Node> q1 = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.remove();
            q1.add(node);
            if (node.right != null) {
                q.add(node.right);
            }
            if (node.left != null) {
                q.add(node.left);
            }
        }
        while (!q1.isEmpty()){
            System.out.print(q1.remove().data+" ");
        }
    }

    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(9);
        invertBinaryTree(tree.root);
    }
}
