package com.example.arrayPracticeNew;

public class PairInSortedRotated {

    static boolean pairInSortedRotated(int arr[], int n, int sum) {
        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        int left = (i + 1) % n;
        int right = i;
        while (left != right) {
            if (arr[left] + arr[right] == sum) {
                return true;
            }
            if (arr[left] + arr[right] < sum) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int X = 16;
        int N = arr.length;
        if (pairInSortedRotated(arr, N, X)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}