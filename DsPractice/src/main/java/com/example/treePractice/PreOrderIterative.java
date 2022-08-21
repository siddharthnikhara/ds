package com.example.treePractice;

import java.util.Stack;


public class PreOrderIterative {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
        }
    }

    static class BinaryTree {
        Node root;

        void iterativePreorder() {
            iterativePreorder(root);
        }

        void iterativePreorder(Node node) {
            if (node == null) {
                return;
            }
            Stack<Node> nodeStack = new Stack<Node>();
            nodeStack.push(root);
            while (nodeStack.empty() == false) {
                Node mynode = nodeStack.peek();
                System.out.print(mynode.data + " ");
                nodeStack.pop();
                if (mynode.right != null) {
                    nodeStack.push(mynode.right);
                }
                if (mynode.left != null) {
                    nodeStack.push(mynode.left);
                }
            }
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.iterativePreorder();
    }
}
