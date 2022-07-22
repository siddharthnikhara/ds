package com.example.stackPractice;

public class ImplementKStackUsingAnArray {
    public static void main(String[] args) {
        kStackUsingAnArray kStackUsingAnArray = new kStackUsingAnArray(3, 6);
        System.out.println(kStackUsingAnArray.push(10, 1));
        System.out.println(kStackUsingAnArray.push(1, 3));
        System.out.println(kStackUsingAnArray.push(12, 2));
        System.out.println(kStackUsingAnArray.push(15, 2));
        System.out.println(kStackUsingAnArray.pop(2));
        System.out.println(kStackUsingAnArray.pop(1));
    }

    static class kStackUsingAnArray {
        int arr[];
        int top[];
        int next[];
        int freeSpot;

        kStackUsingAnArray(int kStack, int arraySize) {
            arr = new int[arraySize];
            top = new int[kStack];
            next = new int[arraySize];
            freeSpot = 0;

            for (int i = 0; i < top.length; i++) {
                top[i] = -1;
            }

            for (int i = 0; i < next.length; i++) {
                next[i] = i + 1;
            }
            next[arraySize - 1] = -1;
        }

        boolean isFull() {
            return freeSpot == -1;
        }

        boolean push(int data, int m) {
            if (isFull()) {
                System.out.println("overflow");
                return false;
            }
            int index = freeSpot;
            freeSpot = next[index];
            arr[index] = data;
            next[index] = top[m-1];
            top[m-1] = index;
            return true;
        }

        int pop(int m) {
            if (top[m - 1] == -1) {
                return -1;
            }
            int index = top[m-1];
            top[m-1] = next[index];
            next[index] =freeSpot;
            freeSpot = index;
            return arr[index];
        }
    }
}