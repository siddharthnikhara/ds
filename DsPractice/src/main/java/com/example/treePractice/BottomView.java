package com.example.treePractice;

public class BottomView {
    Node root;

    static class Node {
        int data;
        Node right, left;

        public Node(int d) {
            data = d;
        }
    }

    public static void print_bottom_view(Node n) {
        if (n == null)
            return;
        if (n.left == null && n.right == null) {
            System.out.print(n.data + " ");
        }
        print_bottom_view(n.left);
        print_bottom_view(n.right);
    }

    public static void main(String[] args) {
        BottomView tree = new BottomView();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        System.out.println("Bottom View of the Tree :");
        print_bottom_view(tree.root);
    }
}
