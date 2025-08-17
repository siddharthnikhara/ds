package com.example.linkedListBasic;

public class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	void removeNthNode(ListNode head, int n) {
		ListNode second = head;
		int count =1;
		while(second!=null){
			if(count !=n){
				count++;
				if(count == n){
					second.next=second.next.next;
				}
				second = second.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llist.head = first;
		first.next = second;
		second.next = third;
		printList();
	}
}
