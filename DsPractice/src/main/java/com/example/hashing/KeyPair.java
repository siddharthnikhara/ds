package com.example.hashing;

import java.util.*;

public class KeyPair {
    public static void main(String[] args) {
        int arr[] = {1, 4, 65, 23, 543, 32};
        int x = 97;
        int n = 6;
        System.out.println(sumOf2Number(arr, n, x));
    }

    static boolean sumOf2Number(int arr[], int n, int x) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Iterator itr = map.entrySet().iterator();
        while ((itr.hasNext())) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) itr.next();

            int key = entry.getKey();
            int value = entry.getValue();

            int pair = x - key;

            if (pair == key) {
                if (value > 1) {
                    return true;
                }
            } else {
                if (map.containsKey(pair)) {
                    return true;
                }
            }
        }

        return false;
    }
}