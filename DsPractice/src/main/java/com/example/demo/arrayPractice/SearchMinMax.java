package com.example.demo.arrayPractice;

public class SearchMinMax {

	public static void main(String[] args) {
		int a[] = { 1, 7, 2, 4, 5, 9, 10, 105, 150 };
		int min = a[0];
		int max = a[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			} else if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Min no is:  " + min + " and Max no is  " + max);

	}

}
