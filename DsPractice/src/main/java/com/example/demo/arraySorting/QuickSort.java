package com.example.demo.arraySorting;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		sort(arr, 0, arr.length-1);

		for (int a : arr) {
			System.out.println(a + " ");
		}
	}

	static int partition(int[] arr, int low, int high) {
		int pi = arr[(low + high) / 2];
		while (low <= high) {
			while (pi > arr[low]) {
				low++;
			}
			while (arr[high] > pi) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	static void sort(int[] arr, int low, int high) {
		int par = partition(arr, low, high);
		if (low < par - 1) {
			sort(arr, low, par - 1);
		} if(high>par) {
			sort(arr, par, high);
		}

	}

}
