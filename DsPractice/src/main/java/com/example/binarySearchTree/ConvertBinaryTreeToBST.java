package com.example.binarySearchTree;

import java.util.*;

public class ConvertBinaryTreeToBST {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static int index;

    static void storeInorder(Node node, int inorder[]) {
        if (node == null)
            return;
        storeInorder(node.left, inorder);
        inorder[index] = node.data;
        index++;
        storeInorder(node.right, inorder);
    }

    static int countNodes(Node root) {
        if (root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    static void arrayToBST(int[] arr, Node root) {
        if (root == null)
            return;
        arrayToBST(arr, root.left);
        root.data = arr[index];
        index++;
        arrayToBST(arr, root.right);
    }

    static void binaryTreeToBST(Node root) {
        if (root == null)
            return;

        int n = countNodes(root);
        int arr[] = new int[n];
        storeInorder(root, arr);
        Arrays.sort(arr);
        index = 0;
        arrayToBST(arr, root);
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        return temp;
    }

    static void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String args[]) {
        Node root = newNode(10);
        root.left = newNode(30);
        root.right = newNode(15);
        root.left.left = newNode(20);
        root.right.right = newNode(5);
        binaryTreeToBST(root);
        System.out.println("Following is Inorder Traversal of the converted BST: ");
        printInorder(root);
    }
}