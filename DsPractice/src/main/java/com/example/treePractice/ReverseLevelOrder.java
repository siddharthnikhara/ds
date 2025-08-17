package com.example.treePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void reverseLevelOrder(Node node) {
        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList();
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.remove();
            stack.push(node);
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }
        while (stack.empty() == false) {
            System.out.print(stack.pop().data + " ");

        }
    }


    public static void main(String[] args) {
        ReverseLevelOrder tree = new ReverseLevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Level Order traversal of binary tree is :");
        tree.reverseLevelOrder(tree.root);
        tree.reverseLevelOrderWithNewlines(tree.root);
    }

    class NodeLevel {
        Node node;
        int level;

        NodeLevel(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public void reverseLevelOrderWithNewlines(Node root) {
        Stack<NodeLevel> stack = new Stack<>();
        Queue<NodeLevel> queue = new LinkedList<>();

        queue.add(new NodeLevel(root, 0));

        while (!queue.isEmpty()) {
            NodeLevel current = queue.remove();
            stack.push(current);

            // Push right first to ensure left comes out first in reverse
            if (current.node.right != null) {
                queue.add(new NodeLevel(current.node.right, current.level + 1));
            }
            if (current.node.left != null) {
                queue.add(new NodeLevel(current.node.left, current.level + 1));
            }
        }

        int currentLevel = -1;
        while (!stack.isEmpty()) {
            NodeLevel nl = stack.pop();
            if (nl.level != currentLevel) {
                currentLevel = nl.level;
                System.out.println(); // new level
            }
            System.out.print(nl.node.data + " ");
        }
    }

}


