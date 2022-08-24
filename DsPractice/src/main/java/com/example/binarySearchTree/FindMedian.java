package com.example.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class FindMedian {

    static class Node {
        Node left, right;
        int key;
    }

    static List<Integer> interNodes = new ArrayList<>();

    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    static Node insertNode(Node node, int key) {
        if (node == null)
            return newNode(key);
        if (key < node.key)
            node.left = insertNode(node.left, key);

        else if (key > node.key)
            node.right = insertNode(node.right, key);
        return node;
    }

    static void getIntermediateNodes(Node root, int node1, int node2) {
        if (root == null)
            return;
        getIntermediateNodes(root.left, node1, node2);
        if (root.key <= node2 && root.key >= node1) {
            interNodes.add(root.key);
        }
        getIntermediateNodes(root.right, node1, node2);
    }

    static float findMedian(Node root, int node1, int node2) {
        getIntermediateNodes(root, node1, node2);
        int nSize = interNodes.size();
        return (nSize % 2 == 1) ?
                (float) interNodes.get(nSize / 2) :
                (float) (interNodes.get((nSize - 1) / 2) +
                        interNodes.get(nSize / 2)) / 2;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insertNode(root, 8);
        insertNode(root, 3);
        insertNode(root, 1);
        insertNode(root, 6);
        insertNode(root, 4);
        insertNode(root, 11);
        insertNode(root, 15);

        System.out.print(findMedian(root, 3, 11));
    }
}

