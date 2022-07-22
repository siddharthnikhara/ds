package com.example.stackPractice;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int arr[] = {13, 7, 6, 12};
        nextSmallerElement(arr, 4);
    }

    static void nextSmallerElement(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        int output[] = new int[n];

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i]<stack.peek()){
                stack.pop();
            }
            output[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}