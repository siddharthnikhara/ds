package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePractice1 {
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
            Node new_node = new Node(nodes[idx]);
            new_node.left = buildTree(nodes);
            new_node.right = buildTree(nodes);
            return new_node;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node node = q.remove();
                if (node == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(node.data + " ");
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
            }
        }

        public static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCounts = countOfNodes(root.left);
            int rightCounts = countOfNodes(root.right);
            return leftCounts + rightCounts + 1;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            int myHeight = Math.max(leftHeight, rightHeight) + 1;
            return myHeight;
        }

        public static int diamOfTree1(Node root) {
            if (root == null) {
                return 0;
            }
            int diam1 = diamOfTree1(root.left);
            int diam2 = diamOfTree1(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
            return Math.max(diam1, Math.max(diam2, diam3));
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node node = binaryTree.buildTree(nodes);
        System.out.println(node.data);
        binaryTree.preOrder(node);
        System.out.println();
        binaryTree.inOrder(node);
        System.out.println();
        binaryTree.postOrder(node);
        System.out.println();
        binaryTree.levelOrder(node);
        System.out.println();
        System.out.println(binaryTree.countOfNodes(node));
        System.out.println();
        System.out.println(binaryTree.sumOfNodes(node));
        System.out.println();
        System.out.println(binaryTree.heightOfTree(node));
        System.out.println();
        System.out.println(binaryTree.diamOfTree1(node));
    }

    static class DiameterNode {
        int height;
        int diam;

        DiameterNode(int height, int diam) {
            this.diam = diam;
            this.height = height;
        }
    }

    static DiameterNode diameterNode2(Node root) {
        if(root==null){
            return new DiameterNode(0,0);
        }
        DiameterNode left = diameterNode2(root.left);
        DiameterNode right = diameterNode2(root.right);
        int myheight = Math.max(left.height,right.height)+1;

        int diam = left.diam;
        int diamright = right.diam;
        int diam3 = left.height+right.height+1;
        int mydiam = Math.max(Math.max(diam,diamright),diam3)+1;
        DiameterNode node = new DiameterNode(mydiam,myheight);
        return node;
    }
}
