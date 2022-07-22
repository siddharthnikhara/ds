package com.example.stackPractice;

import java.util.Stack;

public class LargestRectangularAreaInHistogram {
    public static void main(String[] args) {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + largestRectangularAreaInHistogram(hist));
    }
    static int largestRectangularAreaInHistogram(int arr[]){
        int n =arr.length;
        int next[] = new int[n];
        next = nextSmallerElement(arr,n);

        int prev[]=new int[n];
        prev = prevSmallerElement(arr,n);
        int area = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int l =arr[i];
            if(next[i]==-1){
                next[i]=n;
            }
            int b = next[i]-prev[i]-1;
            int newArea = l*b;
            area =Integer.max(area,newArea);
        }
        return area;
    }

    private static int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int output[] = new int[n];

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i]<stack.peek()){
                stack.pop();
            }
            output[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return output;
    }
    private static int[] prevSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int output[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i]<stack.peek()){
                stack.pop();
            }
            output[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return output;
    }
}