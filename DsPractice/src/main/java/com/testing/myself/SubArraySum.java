package com.testing.myself;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
            int arr[] = {15,2,6,5,7,8,10,23};
            int key =23;
    }

    boolean subArraySum(int arr[], int key) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum == key) {
                System.out.println("currSum 0 to "+ i);
                return true;
            }
            if(map.containsKey(currSum-key)){
                System.out.println(map.get(currSum-key) + "  ,"+i );
                return true;
            }
            map.put(currSum, i);
        }
        return false;
    }
}
