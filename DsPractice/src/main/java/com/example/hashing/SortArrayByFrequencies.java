package com.example.hashing;

import java.util.HashMap;
import java.util.Map;

public class SortArrayByFrequencies {
    public static void main(String[] args) {
        int n[] ={4, 1, 3, 5, 2, 3, 1, 7};
        sortArrayByFrequencies(n);
    }

    static int[] sortArrayByFrequencies(int a[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a1 : a) {
            if (map.containsKey(a1)) {
                map.put(a1, map.get(a1) + 1);
            } else {
                map.put(a1, 1);
            }
        }
        map.entrySet().stream().sorted();
        return null;
    }
}