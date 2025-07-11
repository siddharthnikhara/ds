package com.example.searchingAndsorting;

import java.util.HashMap;

class CountTheTriplets {

    static int countTriplets(int[] arr, int ratio) {
        int count = 0;

        // Create two HashMaps to store the frequency of elements
        HashMap<Integer, Long> rightMap = new HashMap<>();
        HashMap<Integer, Long> leftMap = new HashMap<>();

        // Populate rightMap with the frequency of each element
        for (int num : arr) {
            rightMap.put(num, rightMap.getOrDefault(num, 0L) + 1);
        }

        // Iterate through the array to find triplets
        for (int num : arr) {
            // Decrease the count in rightMap as we move forward
            rightMap.put(num, rightMap.get(num) - 1);

            // Check for the existence of the previous element (num / ratio) in leftMap
            if (num % ratio == 0 && leftMap.containsKey(num / ratio)) {
                // Multiply the frequencies of the previous and next elements to get the count
                count += leftMap.get(num / ratio) * rightMap.getOrDefault(num * ratio, 0L);
            }

            // Update leftMap with the current element's frequency
            leftMap.put(num, leftMap.getOrDefault(num, 0L) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int ratio = 2;
        int result = countTriplets(arr, ratio);
        System.out.println("Number of triplets: " + result);
    }
}