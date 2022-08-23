package com.example.binarySearchTree;

public class PredecessorAndSuccessorInBST {

    static class Node {
        int key;
        Node left, right;

        public Node() {
        }

        public Node(int key) {
            this.key = key;
        }
    }

    static Node pre = new Node(), suc = new Node();

    static void findPreSuc(Node root, int key) {

        if (root == null)
            return;
        if (root.key == key) {
            if (root.left != null) {
                Node tmp = root.left;
                while (tmp.right != null) {
                    tmp = tmp.right;
                }
                pre = tmp;
            }

            if (root.right != null) {
                Node tmp = root.right;
                while (tmp.left != null) {
                    tmp = tmp.left;
                }
                suc = tmp;
            }
            return;
        }

        if (root.key > key) {
            suc = root;
            findPreSuc(root.left, key);
        } else {
            pre = root;
            findPreSuc(root.right, key);
        }
    }

    static Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);
        if (key < node.key)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);

        return node;
    }

    public static void main(String[] args) {
        int key = 65;
        Node root = new Node();
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        findPreSuc(root, key);
        if (pre != null)
            System.out.println("Predecessor is " + pre.key);
        else
            System.out.println("No Predecessor");

        if (suc != null)
            System.out.println("Successor is " + suc.key);
        else
            System.out.println("No Successor");
    }
}