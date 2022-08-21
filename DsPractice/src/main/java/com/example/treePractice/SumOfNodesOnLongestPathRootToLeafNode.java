package com.example.treePractice;

public class SumOfNodesOnLongestPathRootToLeafNode {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxLen;
    static int maxSum;


    static void sumOfLongRootToLeafPath(Node root, int sum, int len) {
        if (root == null) {
            if (maxLen < len) {
                maxLen = len;
                maxSum = sum;
            } else if (maxLen == len && maxSum < sum) {
                maxSum = sum;
            }
            return;
        }
        sumOfLongRootToLeafPath(root.left, sum + root.data, len + 1);
        sumOfLongRootToLeafPath(root.right, sum + root.data, len + 1);
    }

    static int sumOfLongRootToLeafPathUtil(Node root) {
        if (root == null) {
            return 0;
        }
        maxSum = Integer.MIN_VALUE;
        maxLen = 0;
        sumOfLongRootToLeafPath(root, 0, 0);
        return maxSum;
    }

    public static void main(String args[]) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(7);
        root.left.right = new Node(1);
        root.right.left = new Node(2);
        root.right.right = new Node(3);
        root.left.right.left = new Node(6);
        System.out.println("Sum = " + sumOfLongRootToLeafPathUtil(root));
    }
}

