package com.example.linkedlist;

public class CircularLinkedList2 {

  static class Node {
    int data;
    Node next;
    Node() {}
    Node(int data) {
      this.data = data;
    }
  }

  private Node head;
  private Node tail;

  public CircularLinkedList2() {
    this.head = null;
    this.tail = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void insertAtFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
      newNode.next = head;
    } else {
      Node temp = head;
      newNode.next = temp;
      head = newNode;
      tail.next = head;
    }
  }

  public void insertAtLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
      newNode.next = head;
    } else {
      tail.next = newNode;
      tail = newNode;
      tail.next = head;
    }
  }

  public void insertAtIndex(int data, int position) {
    Node temp, newNode;
    int i, count;
    newNode = new Node();
    temp = head;
    count = size();
    if (temp == null || size() < position)
      System.out.println("Index is greater than size of the list");
    else {
      newNode.data = data;
      for (i = 1; i < position - 1; i++) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
    }
  }

  public void deleteFirst() {
    if (head == null) {
      return;
    } else {
      if (head != tail) {
        head = head.next;
        tail.next = head;
      }
      else {
        head = tail = null;
      }
    }
  }

  public void deleteLast() {
    if (head == null) {
      return;
    } else {
      if (head != tail) {
        Node current = head;
        while (current.next != tail) {
          current = current.next;
        }
        tail = current;
        tail.next = head;
      }
      else {
        head = tail = null;
      }
    }
  }

  public void deleteNode(int data) {
    if (head == null)
      System.out.println("List is empty");
    Node currentNode = head;
    Node previousNode = new Node();
    while (currentNode.data != data) {
      if (currentNode.next == head) {
        System.out.println("Given node with data " + data + " is not found in the circular linked list.");
        break;
      }
      previousNode = currentNode;
      currentNode = currentNode.next;
    }

    if (currentNode == head && currentNode.next == head) {
      head = null;
    }
    if (currentNode == head) {
      previousNode = head;
      while (previousNode.next != head) {
        previousNode = previousNode.next;
      }
      head = currentNode.next;
      previousNode.next = head;
    }
    else if (currentNode.next == head) {
      previousNode.next = head;
    } else {
      previousNode.next = currentNode.next;
    }
  }

  public void display() {
    Node temp = head;
    if (head != null) {
      do {
        System.out.printf("%d ", temp.data);
        temp = temp.next;
      } while (temp != head);
    }
    System.out.printf("\n");
  }

  public int size() {
    int size = 0;
    if (head != null) {
      Node temp = head;
      while (temp.next != head) {
        temp = temp.next;
        size++;
      }
      size++;
    }
    return size;
  }

  public void searchNode(int data) {
    System.out.println("Searching for data:" + data);
    Node current = head;
    int i = 1;
    boolean flag = false;
    if (head == null) {
      System.out.println("List is empty");
    } else {
      do {
        if (current.data == data) {
          flag = true;
          break;
        }
        current = current.next;
        i++;
      } while (current != head);
      if (flag)
        System.out.println("Element is present in the list at the position : " + i);
      else
        System.out.println("Element is not present in the list");
    }
  }

  public static void main(String[] args) {
    CircularLinkedList2 list = new CircularLinkedList2();
    list.insertAtFirst(1);
    list.display();
    System.out.println("size :" + list.size());
    list.insertAtFirst(2);
    list.display();
    System.out.println("size :" + list.size());
    list.insertAtLast(3);
    list.display();
    System.out.println("size :" + list.size());
    list.display();
    list.insertAtLast(4);
    System.out.println("size :" + list.size());
    list.display();
    list.insertAtIndex(5, 3);
    System.out.println("size :" + list.size());
    list.display();

    list.deleteNode(8);
    System.out.println("size :" + list.size());
    list.display();

    list.deleteNode(2);
    System.out.println("Node with data 2 has been deleted");
    System.out.println("size :" + list.size());
    list.display();

    list.searchNode(5);
    list.display();
  }
}