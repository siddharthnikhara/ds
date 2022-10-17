package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

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

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node newNode = q.remove();
            if (newNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(newNode.data + " ");
                if (newNode.left != null) {
                    q.add(newNode.left);
                }
                if (newNode.right != null) {
                    q.add(newNode.right);
                }
            }
        }
    }

    static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);
        return leftNode + rightNode + 1;
    }

    static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = sumOfNodes(root.left);
        int rightNode = sumOfNodes(root.right);
        return leftNode + rightNode + root.data;
    }

    static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int letHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(letHeight, rightHeight) + 1;
    }

    public static int diamOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diamOfTree(root.left);
        int diam2 = diamOfTree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(diam1, Math.max(diam2, diam3));
    }

    static class TreeInfo {
        int hi;
        int diam;

        TreeInfo(int hi, int diam) {
            this.hi = hi;
            this.diam = diam;
        }

        public static TreeInfo diameter(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameter(root.left);
            TreeInfo right = diameter(root.right);

            int myHeight = Math.max(left.hi, right.hi) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.hi + right.hi + 1;

            int myDiam = Math.max(Math.max(diam1, diam2), diam3);
            TreeInfo myTree = new TreeInfo(myHeight, myDiam);
            return myTree;
        }
    }


    //subTree
    public static boolean isSubTree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

    }

    private static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    //sum of nodes at kth level
    public static void sumAtLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        int result = 0;
        int flag = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                flag++;
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (flag == k) {
                    result += currNode.data;
                }
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left = new Node(4);
        tree1.root.left.right = new Node(5);

//        System.out.println("pre order");
//        preOrder(tree.root);
//        System.out.println("in order");
//        inOrder(tree.root);
//        System.out.println("post order");
//        postOrder(tree.root);
//        System.out.println("level order");
//        levelOrder(tree.root);
//        System.out.println("count of nodes");
//        System.out.println(countOfNodes(tree.root));
//        System.out.println("sum of nodes");
//        System.out.println(sumOfNodes(tree.root));
//        System.out.println("height of tree");
//        System.out.println(heightOfTree(tree.root));
//        System.out.println("diameter of tree");
//        System.out.println(diamOfTree(tree.root));
//        System.out.println("subTree");
//        isSubTree(tree.root, tree1.root);
//        System.out.println("Diameter");
//        TreeInfo.diameter(tree.root);
        System.out.println("sum at level");
        sumAtLevel(tree.root, 1);
    }
}
