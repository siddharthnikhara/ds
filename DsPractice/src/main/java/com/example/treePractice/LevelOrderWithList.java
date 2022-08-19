package com.example.treePractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderWithList {
    Node root;

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if (root == null) return wrapList;
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.add(queue.peek().left);
                if (queue.peek().right != null) queue.add(queue.peek().right);
                subList.add(queue.remove().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        LevelOrderWithList tree = new LevelOrderWithList();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Level Order traversal of binary tree is :");
        System.out.println(levelOrder(tree.root));
    }
}