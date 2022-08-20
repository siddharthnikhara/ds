package com.example.treePractice;

public class SumTree {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class SumTre{
        boolean isSum;
        int sum;
        SumTre(boolean isSum,int sum){
            this.isSum=isSum;
            this.sum=sum;
        }

        static SumTre isSum(Node root){
             if(root==null){
                 return new SumTre(true,0);
             }

             if(root.left == null && root.right == null){
                 return new SumTre(true,root.data);
             }

             SumTre left = isSum(root.left);
             SumTre right = isSum(root.right);

             boolean leftBol = left.isSum;
             boolean rightBol = right.isSum;

             boolean sum = root.data==(left.sum+ right.sum);

            if (leftBol && rightBol && sum) {
                return new SumTre(true,2*root.data);
            }
            return new SumTre(false,0);
        }
    }

    public static void main(String[] args) {
        SumTree tree = new SumTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
//        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(3);
//        tree.root.right.right.right = new Node(8);
//        tree.root.right.right.right.right = new Node(9);
        System.out.println(SumTre.isSum(tree.root).isSum);
    }

}
