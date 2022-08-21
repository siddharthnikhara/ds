package com.example.treePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumSwapRequiredToConvertBinaryTreeToBinarySearchTree {

    static void inorder(int a[], List<Integer> v, int n, int index) {
        if (index >= n) {
            return;
        }
        inorder(a, v, n, 2 * index + 1);
        v.add(a[index]);
        inorder(a, v, n, 2 * index + 2);
    }

    public static int minSwaps(int[] arr, int N) {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            h.put(arr[i], i);
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];
                swap(arr, i, h.get(temp[i]));
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws Exception {
        int a[] = {5, 6, 7, 8, 9, 10, 11};

        int n = a.length;
        List<Integer> v = new ArrayList<>();
        inorder(a, v, n, 0);
        System.out.println(minSwaps(v.stream().mapToInt(Integer::intValue).toArray(), n));
    }
}