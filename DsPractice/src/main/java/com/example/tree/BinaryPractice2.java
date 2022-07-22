package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryPractice2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
                Node node = new Node(nodes[idx]);
                node.left = buildTree(nodes);
                node.right = buildTree(nodes);
                return node;
        }

        static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
        }

        static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node newNode = q.remove();
                if (newNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(newNode.data + " ");
                    if (newNode.left != null) {
                        q.add(newNode.left);
                    }
                    if (newNode.right != null) {
                        q.add(newNode.right);
                    }
                }
            }
        }

        static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNode = countOfNodes(root.left);
            int rightNode = countOfNodes(root.right);
            return leftNode + rightNode + 1;
        }

        static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNode = sumOfNodes(root.left);
            int rightNode = sumOfNodes(root.right);
            return leftNode + rightNode + root.data;
        }

        static int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int letHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            return Math.max(letHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        BinaryPractice2.Node node = BinaryPractice2.BinaryTree.buildTree(nodes);
        System.out.println(node.data);
        BinaryPractice2.BinaryTree.preOrder(node);
        System.out.println();
        BinaryPractice2.BinaryTree.inOrder(node);
        System.out.println();
        BinaryPractice2.BinaryTree.postOrder(node);
        System.out.println();
        BinaryPractice2.BinaryTree.levelOrder(node);
        System.out.println();
        System.out.println(BinaryPractice2.BinaryTree.countOfNodes(node));
        System.out.println();
        System.out.println(BinaryPractice2.BinaryTree.sumOfNodes(node));
        System.out.println();
        System.out.println(BinaryPractice2.BinaryTree.heightOfTree(node));
    }
}
