package com.example.treePractice;// Java program to print left view of Binary
// Tree
import java.util.*;

public class PrintRightView {
	// Binary tree node
	private static class Node {
		int data;
		Node left, right;

		public Node(int data)
		{
			this.data = data;
			this.left = null;¸
			this.right = null;
		}
	}

	// function to print left view of binary tree
	private static void printLeftView(Node root)
	{
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			// number of nodes at current level
			int n = queue.size();

			// Traverse all nodes of current level
			for (int i = 1; i <= n; i++) {
				Node temp = queue.poll();

				// Print the left most element at
				// the level
				if (i == 1)
					System.out.print(temp.data + " ");

				// Add left node to queue
				if (temp.left != null)
					queue.add(temp.left);

				// Add right node to queue
				if (temp.right != null)
					queue.add(temp.right);
			}
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		// construct binary tree as shown in
		// above diagram
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.right.right = new Node(15);
		root.right.left = new Node(12);
		root.right.right.left = new Node(14);

		printLeftView(root);
	}
}

// This code is contributed by
// Manne SreeCharan
