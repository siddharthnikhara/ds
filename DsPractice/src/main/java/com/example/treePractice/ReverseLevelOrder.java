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
            node = queue.peek();
            queue.remove();
            stack.push(node);

            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }
        while (stack.empty() == false) {
            node = stack.peek();
            System.out.print(node.data + " ");
            stack.pop();
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
    }
}


