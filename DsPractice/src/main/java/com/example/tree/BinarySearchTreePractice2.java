package com.example.tree;

import java.util.ArrayList;

public class BinarySearchTreePractice2 {

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

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        } else if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean isFound(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data > val) {
            return isFound(root.left, val);
        } else if (root.data == val) {
            return true;
        } else {
            return isFound(root.right, val);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        if (isFound(root, 5)) {
            System.out.print("found");
        } else {
            System.out.print("not found");
        }
        System.out.println();
        delete(root, 3);
        inOrder(root);
        printInRange(root, 3, 6);
        printRoot2Leaf(root, new ArrayList());
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            //case1
            if (root.left == null && root.right == null) {
                return null;
            }
            //case2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case3
            Node IS = isSucessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node isSucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }

    static void printPath(ArrayList path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    static void printRoot2Leaf(Node root, ArrayList path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }
}
