package com.example.arraySearhing;

public class JumpSearch {
	public static int jumpSearch(int[] arr, int x) {
		int step = 0;
		int prev_step = 0;
		for (int i = 0; i < arr.length; i++) {
			if (step >= arr.length - 1) {
				step = arr.length - 1;
			}
			if (x > arr[step]) {
				prev_step = step;
				step = step + (int) Math.sqrt(arr.length);
			} else {
				for (int j = prev_step; j <= step; j++) {
					if (arr[j] == x) {
						return j;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 454 };
		int x = 13;
		int index = jumpSearch(arr, x);
		System.out.println("\nNumber " + x + " is at index " + index);
	}
}
