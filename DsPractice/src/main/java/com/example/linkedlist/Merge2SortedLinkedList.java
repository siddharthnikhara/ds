package com.example.linkedlist;

public class Merge2SortedLinkedList {

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    static class MergeLists {
        ListNode head;

        public void add(ListNode node) {
            if (head == null) {
                head = node;
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        void printList() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode result = dummy;
            while (list1 != null && list2 != null) {
                if (list1.data < list2.data) {
                    dummy.next = list1;
                    list1 = list1.next;
                } else {
                    dummy.next = list2;
                    list2 = list2.next;
                }
                dummy = dummy.next;
            }

            if (list1 != null) {
                dummy.next = list1;
            } else {
                dummy.next = list2;
            }
            return result.next;
        }
    }

    public static void main(String args[]) {
        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        llist1.add(new ListNode(5));
        llist1.add(new ListNode(10));
        llist1.add(new ListNode(15));

        llist2.add(new ListNode(2));
        llist2.add(new ListNode(3));
        llist2.add(new ListNode(20));

        llist1.head = llist1.mergeTwoLists(llist1.head, llist2.head);
        llist1.printList();
    }
}
