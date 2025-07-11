package com.sealedclass.example;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            dummy.next = list1;
        }

        if (list2 != null) {
            dummy.next = list2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
        mergeTwoLists(list1, list2);
    }
}