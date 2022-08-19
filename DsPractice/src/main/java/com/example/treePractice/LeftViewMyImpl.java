package com.example.treePractice;

import java.util.ArrayList;

public class LeftViewMyImpl {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> l = new ArrayList();
        l.add(root.data);
        while (root.left != null) {
            ArrayList<Integer> left = leftView1(root.left, l);
            return l;
        }
        return l;
    }

    static ArrayList<Integer> leftView1(Node root, ArrayList<Integer> l) {
        if (root == null) {
            return l;
        }
        l.add(root.data);
        leftView1(root.left, l);
        return l;
    }

    public static void main(String[] args) {
        LeftViewMyImpl tree = new LeftViewMyImpl();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(8);
        ArrayList<Integer> l = leftView(tree.root);
        l.forEach(System.out::println);
    }
}