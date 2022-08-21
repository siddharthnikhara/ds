package com.example.treePractice;

import java.util.*;

public class ConstructBinaryTreeFromBracketParanthesis {

    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }

    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%d ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    static int findIndex(String str, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        Stack<Character> s = new Stack<>();
        for (int i = si; i <= ei; i++) {
            if (str.charAt(i) == '(') {
                s.add(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (s.peek() == '(') {
                    s.pop();
                    if (s.isEmpty()) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    static Node treeFromString(String str, int si, int ei) {
        if (si > ei) {
            return null;
        }

        Node root = newNode(str.charAt(si) - '0');
        int index = -1;

        if (si + 1 <= ei && str.charAt(si + 1) == '(') {
            index = findIndex(str, si + 1, ei);
        }

        if (index != -1) {
            root.left = treeFromString(str, si + 2, index - 1);
            root.right = treeFromString(str, index + 2, ei - 1);
        }
        return root;
    }

    public static void main(String[] args) {
        String str = "4(2(3)(1))(6(5))";
        Node root = treeFromString(str, 0, str.length() - 1);
        preOrder(root);
    }
}

