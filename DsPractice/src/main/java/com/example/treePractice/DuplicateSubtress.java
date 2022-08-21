package com.example.treePractice;

import java.util.HashMap;

public class DuplicateSubtress {

    static HashMap<String, Integer> m;
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static String inorder(Node node) {
        if (node == null) {
            return "";
        }

        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";

        if (m.get(str) != null && m.get(str) == 1) {
            System.out.print(node.data + " ");
        }

        if (m.containsKey(str)) {
            m.put(str, m.get(str) + 1);
        } else {
            m.put(str, 1);
        }

        return str;
    }

    static void printAllDups(Node root) {
        m = new HashMap<>();
        inorder(root);
    }

    public static void main(String args[]) {
        DuplicateSubtress tree = new DuplicateSubtress();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(2);
        tree.root.right.left.left = new Node(4);
        tree.root.right.right = new Node(4);
        printAllDups(tree.root);
    }
}
