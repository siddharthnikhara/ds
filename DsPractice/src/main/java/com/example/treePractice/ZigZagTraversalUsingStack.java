package com.example.treePractice;

import java.util.*;

public class ZigZagTraversalUsingStack {

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    List printZigZagTraversal() {

        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        currentLevel.push(root);
        boolean leftToRight = true;

        while (!currentLevel.isEmpty()) {
            Node node = currentLevel.pop();
            list.add(node.data);
            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ZigZagTraversalUsingStack tree = new ZigZagTraversalUsingStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println("ZigZag Order traversal of binary tree is");
        tree.printZigZagTraversal().forEach(System.out::println);
    }
}