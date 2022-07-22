package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePractice {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    //subTree
    public static boolean isSubTree(Node root, Node subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);

    }

    private static boolean isIdentical(Node root, Node subRoot) {
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot ==null){
            return false;
        }
        if(root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    //sum of nodes at kth level
    public static void sumAtLevel(Node root,int k){
        if(root==null){
            return;
        }
        int result =0;
        int flag=1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode==null){
                    flag++;
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(flag==k){
                    result += currNode.data;
                }
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(node);
        sumAtLevel(root,3);
    }
}