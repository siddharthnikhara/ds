package com.example.binarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoBST {

    static class Node {
        int data;

        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static class BinarySearchTree {
        Node root;
        static ArrayList<Integer> list1= new ArrayList<>();
        static ArrayList<Integer> list2 = new ArrayList<>();

        public static void inorder(Node node) {
            if (node == null)
                return;
            inorder(node.left);
            System.out.println(node.data+" ");
            inorder(node.right);
        }
        public ArrayList<Integer> storeInorder(Node node, ArrayList<Integer> list) {
            if (node == null)
                return list;
            storeInorder(node.left, list);
            list.add(node.data);
            storeInorder(node.right, list);
            return list;
        }


        Node ALtoBST(ArrayList<Integer> list, int start, int end) {
            if (start > end)
                return null;
            int mid = (start + end) / 2;
            Node node = new Node(list.get(mid));
            node.left = ALtoBST(list, start, mid - 1);
            node.right = ALtoBST(list, mid + 1, end);
            return node;
        }

        Node mergeTrees(Node node1, Node node2) {
            list1 = storeInorder(node1, list1);
            list2 = storeInorder(node2, list2);
            list1.addAll(list2);
            Collections.sort(list1);
            Node node = ALtoBST(list1, 0, list1.size() - 1);
            return node;
        }

        public static void main(String[] args) {
            BinarySearchTree tree1 = new BinarySearchTree();
            tree1.root = new Node(100);
            tree1.root.left = new Node(50);
            tree1.root.right = new Node(300);
            tree1.root.left.left = new Node(20);
            tree1.root.left.right = new Node(70);
            BinarySearchTree tree2 = new BinarySearchTree();
            tree2.root = new Node(80);
            tree2.root.left = new Node(40);
            tree2.root.right = new Node(120);
            BinarySearchTree tree = new BinarySearchTree();
            tree.root = tree.mergeTrees(tree1.root, tree2.root);
            System.out.println("The Inorder traversal of the merged BST is: ");
            inorder(tree.root);
        }
    }
}