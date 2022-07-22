package com.example.tree;

public class BinarySearchTreePractice {
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

    static Node buildTree(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = buildTree(root.left, val);
        } else {
            root.right = buildTree(root.right, val);
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

    static boolean isFound(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return isFound(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return isFound(root.right, key);
        }
    }

    static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            //case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            //case 3
            Node IS = inOrderSucessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inOrderSucessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int nodes[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildTree(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        if (isFound(root, 6)) {
            System.out.print("found");
        } else {
            System.out.print("not found");
        }
        System.out.println();
        //delete(root,3);
        inOrder(root);
    }
}
