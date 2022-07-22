package com.example.stackPractice;

import java.util.*;

public class HasArrayTwoCandidates {
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            map.put(arr[i], 1);
        }
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) itr.next();
            int key = entry.getKey();
            int value = entry.getValue();
            int pair = x - key;
            if (pair == key) {
                if (value > 1) {
                    return true;
                }
            }else{
                if(map.containsKey(pair)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int Arr[] = {1, 4, 45, 6, 10, 8};
        int N = 6, X = 16;
        System.out.println(hasArrayTwoCandidates(Arr, N, X));
    }
}