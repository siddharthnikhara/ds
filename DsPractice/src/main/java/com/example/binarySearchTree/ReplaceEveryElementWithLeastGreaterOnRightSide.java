package com.example.binarySearchTree;

class ReplaceEveryElementWithLeastGreaterOnRightSide {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static Node root;
    static Node succ;

    Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        }
        if (data < node.data) {
            succ = node;
            node.left = insert(node.left, data);
        } else if (data > node.data)
            node.right = insert(node.right, data);

        return node;
    }

    static void replace(int arr[], int n) {
        ReplaceEveryElementWithLeastGreaterOnRightSide tree = new ReplaceEveryElementWithLeastGreaterOnRightSide();
        for (int i = n - 1; i >= 0; i--) {
            succ = null;
            root = tree.insert(root, arr[i]);
            if (succ != null)
                arr[i] = succ.data;
            else
                arr[i] = -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8, 58, 71, 18, 31,
                32, 63, 92, 43, 3,
                91, 93, 25, 80, 28};
        int n = arr.length;
        replace(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}