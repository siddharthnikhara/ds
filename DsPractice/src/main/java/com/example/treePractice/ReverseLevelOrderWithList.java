package com.example.treePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderWithList {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public ArrayList<Integer> reverseLevelOrder(Node node) {
        if (node == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList();
        Queue<Node> q = new LinkedList();
        Stack<Node> stack = new Stack();
        q.add(node);

        while (!q.isEmpty()) {
            Node n = q.remove();
            stack.push(n);
            if (n.right != null) {
                q.add(n.right);
            }
            if (n.left != null) {
                q.add(n.left);
            }

        }
        while (stack.empty() == false) {
            list.add(stack.pop().data);
        }
        return list;
    }

    public static void main(String[] args) {
        ReverseLevelOrderWithList tree = new ReverseLevelOrderWithList();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Level Order traversal of binary tree is :");
        ArrayList<Integer> l = tree.reverseLevelOrder(tree.root);
        l.forEach(System.out::println);
    }
} 