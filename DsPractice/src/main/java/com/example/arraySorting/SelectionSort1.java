package com.example.arraySorting;

public class SelectionSort1 {

	public static void main(String[] args) {
		int[] a = { 11, 7, 6, 9, 5, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		for (int t : a) {
			System.out.print(t + " ");
		}
	}

}
