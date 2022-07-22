package com.example.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public int firstNonRepeating(int arr[]) {
        int result = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                continue;
            }
            map.put(arr[i], 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = map.get(arr[i]);
            if (temp == 1) {
                result = arr[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FirstNonRepeating firstNonRepeating = new FirstNonRepeating();
        int arr[] = {-1, 2, -1, 2, 3, 5};
        System.out.println(firstNonRepeating.firstNonRepeating(arr));
    }

}