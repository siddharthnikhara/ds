package com.example.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeating {

    public int firstRepeating(int arr[]) {
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
            if (temp == 2) {
                result = arr[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FirstRepeating firstRepeating = new FirstRepeating();
        int arr[] = {-1, 2, 2, -1, 2, 3, 5};
        System.out.println(firstRepeating.firstRepeating(arr));
    }

}