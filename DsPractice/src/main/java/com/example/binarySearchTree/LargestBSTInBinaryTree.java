package com.example.binarySearchTree;


public class LargestBSTInBinaryTree {

    static class Node {
        int data;
        Node left, right;

        public Node(final int d) {
            data = d;
        }
    }

    static int MAX = Integer.MAX_VALUE;
    static int MIN = Integer.MIN_VALUE;

    static class NodeInfo {
        int size;
        int max;
        int min;
        boolean isBST;

        NodeInfo() {
        }

        NodeInfo(int size, int max, int min, boolean isBST) {
            this.size = size;
            this.max = max;
            this.min = min;
            this.isBST = isBST;
        }
    }

    static NodeInfo largestBST(Node root) {
        if (root == null) {
            return new NodeInfo(0, Integer.MIN_VALUE,
                    Integer.MAX_VALUE, true);
        }
        NodeInfo left = largestBST(root.left);
        NodeInfo right = largestBST(root.right);
        NodeInfo returnInfo = new NodeInfo();

        returnInfo.min = Math.min(left.min, root.data);
        returnInfo.max = Math.max(right.max, root.data);
        returnInfo.isBST = left.isBST && right.isBST && root.data > left.max && root.data < right.min;

        if (returnInfo.isBST)
            returnInfo.size = left.size + right.size + 1;
        else
            returnInfo.size
                    = Math.max(left.size, right.size);

        return returnInfo;
    }

    static int largestBst(Node root) {
        return largestBST(root).size;
    }

    public static void main(String[] args) {
        final Node node1 = new Node(60);
        node1.left = new Node(65);
        node1.right = new Node(70);
        node1.left.left = new Node(50);

        System.out.print("Size of the largest BST is " + largestBst(node1) + "\n");
    }
}