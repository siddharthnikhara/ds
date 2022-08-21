package com.example.treePractice;

public class Isomorphic {
    Node root, root2;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isIsomorphic(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.data != node2.data) {
            return false;
        }

        boolean a = isIsomorphic(node1.left, node2.left) && isIsomorphic(node1.right, node2.right);
        boolean b = isIsomorphic(node1.left, node2.right) && isIsomorphic(node1.right, node2.left);

        return a || b;
    }


    public static void main(String args[]) {
        Isomorphic tree = new Isomorphic();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(3);
        tree.root2.right = new Node(2);
        tree.root2.right.left = new Node(4);
        tree.root2.right.right = new Node(5);
        tree.root2.left.right = new Node(6);
        tree.root2.right.right.left = new Node(8);
        tree.root2.right.right.right = new Node(7);
        if(isIsomorphic(tree.root,tree.root2)){
            System.out.println(true);
        }else{
            System.out.println(true);
        }
    }
}