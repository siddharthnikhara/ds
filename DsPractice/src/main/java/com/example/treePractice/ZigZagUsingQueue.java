package com.example.treePractice;

import java.util.*;

public class ZigZagUsingQueue {

    static class Node {

        public int data;
        public Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }

    static ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        boolean leftToRight = true;
        while (q.size() > 0) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                temp.add(curr.data);
            }
            if (leftToRight) {

            } else {
                Collections.reverse(temp);
            }
            for (int i = 0; i < temp.size(); i++) {
                ans.add(temp.get(i));
            }
            leftToRight = !(leftToRight);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans;
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(7);
        root.left.right = newNode(6);
        root.right.left = newNode(5);
        root.right.right = newNode(4);
        System.out.println("ZigZag Order traversal of binary tree is");

        ans = zigZagTraversal(root);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}