package com.example.treePractice;

import java.util.*;

public class TopView {

    static class Node {
        Node left;
        Node right;
        int data;
    }

    static class pair {
        int first, second;

        pair(int i, int j) {
            first = i;
            second = j;
        }
    }

    static TreeMap<Integer, pair> m = new TreeMap<>();

    static Node newNode(int key) {
        Node node = new Node();
        node.left = node.right = null;
        node.data = key;
        return node;
    }

    static void fillMap(Node root, int d, int l) {
        if (root == null)
            return;

        if (m.get(d) == null) {
            m.put(d, new pair(root.data, l));
        } else if (m.get(d).second > l) {
            m.put(d, new pair(root.data, l));
        }

        fillMap(root.left, d - 1, l + 1);
        fillMap(root.right, d + 1, l + 1);
    }

    static void topView(Node root) {
        fillMap(root, 0, 0);

        for (Map.Entry<Integer, pair> entry : m.entrySet()) {
            System.out.print(entry.getValue().first + " ");
        }
    }

    public static void main(String args[]) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.right = newNode(4);
        root.left.right.right = newNode(5);
        root.left.right.right.right = newNode(6);
        System.out.println("Following are nodes in" + " top view of Binary Tree");
        topView(root);
    }
}