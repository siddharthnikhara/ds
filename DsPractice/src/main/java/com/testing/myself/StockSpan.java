package com.testing.myself;

import java.util.*;

public class StockSpan {
    
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices
        
        for (int i = 0; i < n; i++) {
            // Pop smaller or equal prices
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            
            // If stack empty → all previous are smaller
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            
            stack.push(i);
        }
        
        return span;
    }
    
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = calculateSpan(prices);
        
        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Span: " + Arrays.toString(result));
    }
}
