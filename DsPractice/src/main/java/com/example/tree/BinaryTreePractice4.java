package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePractice4 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int countOfNode(Node root){
            if(root==null){
                return 0;
            }
            int leftCount=countOfNode(root.left);
            int rightCount=countOfNode(root.right);
            return leftCount+rightCount+1;
        }
        public static int sumOfNode(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sumOfNode(root.left);
            int rightSum=sumOfNode(root.right);
            return leftSum+rightSum+ root.data;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public static boolean isSubtree(Node root, Node subroot){
            if(subroot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
        }

        private static boolean isIdentical(Node root, Node subroot) {
            if(root==null && subroot==null){
                return true;
            }
            if(root==null || subroot==null){
                return false;
            }
            if(root.data ==subroot.data){
                return isIdentical(root.left,subroot.left)  && isIdentical(root.right,subroot.right);
            }
            return false;
        }
    }
    static class TreeInfo{
        int hi;
        int diam;
        TreeInfo(int hi, int diam){
            this.hi=hi;
            this.diam=diam;
        }

        public static TreeInfo diameter2(Node root){
            if(root==null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.hi,right.hi)+1;

            int diam1= left.diam;
            int diam2 = right.diam;
            int diam3 = left.hi+right.hi+1;

            int myDiam = Math.max(Math.max(diam1,diam2),diam3);
            TreeInfo myTree = new TreeInfo(myHeight,myDiam);
            return myTree;
        }
    }



    public static void main(String[] args) {
        int nodes[] = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        BinaryTreePractice4.Node node = BinaryTreePractice4.BinaryTree.buildTree(nodes);

        System.out.println(node.data);
        BinaryTreePractice4.BinaryTree.preOrder(node);
        System.out.println();
        BinaryTreePractice4.BinaryTree.inOrder(node);
        System.out.println();
        BinaryTreePractice4.BinaryTree.postOrder(node);
        System.out.println();
        BinaryTreePractice4.BinaryTree.levelOrder(node);
        System.out.println();
        System.out.println(BinaryTreePractice4.BinaryTree.countOfNode(node));
        System.out.println();
        System.out.println(BinaryTreePractice4.BinaryTree.sumOfNode(node));
        System.out.println();
        System.out.println(BinaryTreePractice4.BinaryTree.height(node));
        System.out.println();
        System.out.println(TreeInfo.diameter2(node).diam);
        System.out.println();
    }
}