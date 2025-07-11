package com.july.sorting;


import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Bakchod {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3, new ListNode());
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode = new ListNode(1, listNode2);

        ListNode listNode13 = new ListNode(4, new ListNode());
        ListNode listNode12 = new ListNode(2, listNode13);
        ListNode listNode11 = new ListNode(1, listNode12);
        mergeTwoLists(listNode, listNode11);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int left = 0, right = 6;
        List list = new ArrayList();
        int newList1 = list1.val;
        int newList2 = list2.val;
        while (left <= right) {
            if (newList1 <= newList2) {
                list.add(newList1);
                newList1 = newList2;
            } else {
                list.add(newList2);
                newList2 = newList2;

            }
        }
        return new ListNode(1);
    }
}
