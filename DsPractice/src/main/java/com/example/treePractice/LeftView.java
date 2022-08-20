package com.example.treePractice;

import java.util.ArrayList;

public class LeftView {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static void solve(Node root, ArrayList<Integer> ans, int level) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(root.data);
        }
        solve(root.left, ans, level + 1);
        solve(root.right, ans, level + 1);
    }

    static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList();
        solve(root, ans, 0);
        return ans;
    }

    public static void main(String[] args) {
        LeftView tree = new LeftView();
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
