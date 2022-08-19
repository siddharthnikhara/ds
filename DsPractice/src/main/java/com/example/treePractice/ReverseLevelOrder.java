package com.example.treePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

    static class Node2 {
        int data;
        Node2 left;
        Node2 right;

        Node2(int data) {
            this.data = data;
            left = right;
        }
    }

    Node2 root1;

    public void reverseLevelOrder(Node2 node) {
        Stack<Node2> stack = new Stack<>();
        Queue<Node2> queue = new LinkedList();
        queue.add(node);

        while (queue.isEmpty() == false) {
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
        tree.root1 = new Node2(1);
        tree.root1.left = new Node2(2);
        tree.root1.right = new Node2(3);
        tree.root1.left.left = new Node2(4);
        tree.root1.left.right = new Node2(5);
        tree.root1.right.left = new Node2(6);
        tree.root1.right.right = new Node2(7);
        System.out.println("Level Order traversal of binary tree is :");
        tree.reverseLevelOrder(tree.root1);
    }
}


