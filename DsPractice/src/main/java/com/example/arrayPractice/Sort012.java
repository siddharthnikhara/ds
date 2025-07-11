package com.example.arrayPractice;

import java.util.Arrays;

public class Sort012 {
	
	// Function to sort array containing 0, 1, and 2
	static void sort012(int[] arr, int n) {
		// Initialization
		int low = 0;
		int high = n - 1;

		for (int i = 0; i < n && i <= high;) {
			// Current element is 0
			if (arr[i] == 0) {
				swap(arr, low, i);
				low++;
				i++;
			}
			// Current element is 2
			else if (arr[i] == 2) {
				swap(arr, i, high);
				high--;
			}
			// Current element is 1
			else {
				i++;
			}
		}
	}

	// Function to swap elements at indices i and j in the array
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Function to print array arr[]
	static void printArray(int arr[], int arr_size) {
		// Iterate and print every element
		for (int i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver Code
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int n = arr.length;

		sort012(arr, n);

		printArray(arr, n);
	}
}
