package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {

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
        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
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

    public static int countOrder(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countOrder(root.left);
        int rightNode = countOrder(root.right);
        return leftNode + rightNode + 1;
    }

    public static int sumOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    //Longest path of tree
    static class TreeInfo {
        int hi;
        int diam;
        TreeInfo(int hi, int diam) {
            this.hi = hi;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int myheight = Math.max(left.hi, right.hi) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.hi + right.hi + 1;
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo treeInfo = new TreeInfo(myheight, mydiam);
        return treeInfo;
    }

        public static void sumAtLevel(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(node);
        sumAtLevel(root);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println(countOrder(root));
        System.out.println(sumOfNode(root));
        System.out.println(height(root));
        System.out.println(diameter(root).diam);
        System.out.println();


    }
}



//    public static void levelOrder(Node root) {
//        if (root == null) {
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while (!q.isEmpty()) {
//            Node currNode = q.remove();
//            if (currNode == null) {
//                System.out.println();
//                if (q.isEmpty()) {
//                    break;
//                } else {
//                    q.add(null);
//                }
//            } else {
//                System.out.print(currNode.data + " ");
//                if (currNode.left != null) {
//                    q.add(currNode.left);
//                }
//                if (currNode.right != null) {
//                    q.add(currNode.right);
//                }
//            }
//        }
//
//    }
//
//
//    public static void sumAtLevel(Node root) {
//        if (root == null) {
//            return;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        queue.add(null);
//        while (!queue.isEmpty()) {
//            Node currNode = queue.remove();
//            if (currNode == null) {
//                System.out.println();
//                if (queue.isEmpty()) {
//                    break;
//                } else {
//                    queue.add(null);
//                }
//            } else {
//                System.out.print(currNode.data + " ");
//                if (currNode.left != null) {
//                    queue.add(currNode.left);
//                }
//                if (currNode.right != null) {
//                    queue.add(currNode.right);
//                }
//            }
//        }
//    }
//
//    public static void levelOrder1(Node root,int k) {
//        if (root == null) {
//            return;
//        }
//        int flag=-1;
//        int result =0;
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while (!q.isEmpty()) {
//            Node currNode = q.remove();
//            if (currNode == null) {
//
//                System.out.println();
//                if (q.isEmpty()) {
//                    break;
//                } else {
//                    q.add(null);
//                }
//            } else {
//                System.out.print(currNode.data + " ");
//                if (currNode.left != null) {
//                    q.add(currNode.left);
//                }
//                if (currNode.right != null) {
//                    q.add(currNode.right);
//                }
//            }
//        }
//    }