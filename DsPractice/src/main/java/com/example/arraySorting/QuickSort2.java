package com.example.arraySorting;

public class QuickSort2 {
	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		sort(arr, 0, arr.length - 1);

		for (int a : arr) {
			System.out.println(a + " ");
		}
	}

	private static void sort(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			sort(arr, low, pi - 1);
		}
		if (high > pi) {
			sort(arr, pi, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
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
}
