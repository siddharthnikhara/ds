package com.example.treePractice;

import java.util.*;
import java.util.stream.Collectors;

public class VerticalTraversalBinaryTree {
    Node root;

    static class Node {
        int key;
        Node left = null, right = null;

        Node(int key) {
            this.key = key;
        }
    }

    static class Pair<U, V> {
        public final U first;
        public final V second;

        private Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public static <U, V> Pair<U, V> of(U a, V b) {
            return new Pair<>(a, b);
        }
    }

    public static void insertIntoMultiMap(Map<Integer, List<Integer>> map, Integer key, Integer value) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }

    public static void printVertical(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // create a `TreeMap` to store the vertical order of binary tree nodes
        Map<Integer, List<Integer>> map = new TreeMap<>();

        // create an empty queue for level order traversal.
        // `It` stores binary tree nodes and their horizontal distance from the root.
        Queue<Pair<Node, Integer>> q = new ArrayDeque<>();

        // enqueue root node with horizontal distance as 0
        q.add(Pair.of(root, 0));

        // loop till queue is empty
        while (!q.isEmpty()) {
            // dequeue front node
            Node node = q.peek().first;
            int dist = q.peek().second;
            q.remove();
            // insert front node value into the map using its horizontal distance
            // as the key
            insertIntoMultiMap(map, dist, node.key);
            // enqueue non-empty left and right child of the front node
            // with their corresponding horizontal distance
            if (node.left != null) {
                q.add(Pair.of(node.left, dist - 1));
            }
            if (node.right != null) {
                q.add(Pair.of(node.right, dist + 1));
            }
        }
        //map.values().stream().forEach(System.out::println);
        List<List<Integer>> l = map.values().stream().collect(Collectors.toList());
        l.forEach(i -> i.forEach(System.out::println));
    }

    public static void main(String[] args) {
        VerticalTraversalBinaryTree tree = new VerticalTraversalBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.left.right.left = new Node(9);
        tree.root.right.left.right.right = new Node(10);
        printVertical(tree.root);
    }
}