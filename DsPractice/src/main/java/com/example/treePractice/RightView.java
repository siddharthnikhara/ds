package com.example.treePractice;

import java.util.ArrayList;

public class RightView {

    Node root;
    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static void solve(Node root, ArrayList<Integer> ans, int level) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(root.data);
        }
        solve(root.right, ans, level + 1);
        solve(root.left, ans, level + 1);
    }

    static ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList();
        solve(node, ans, 0);
        return ans;
    }

    public static void main(String[] args) {
        RightView tree = new RightView();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(15);
        tree.root.right.left = new Node(12);
        tree.root.right.right.left = new Node(14);
        rightView(tree.root);
    }
}