package com.testing.myself;

public class BestTimeToBuy {
    public static void main(String[] args) {

    }

    int bestTimeToBuy(int[] arr) {
        int maxProfit = 0;
        int buy = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (buy > arr[i]) {
                buy = arr[i];
            } else if (arr[i] - buy > maxProfit) {
                maxProfit = arr[i] - buy;
            }
        }
        return maxProfit;
    }
}
