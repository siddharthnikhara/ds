package com.example.demo.arrayPractice;

public class FIndFirstDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 7, 3, 5, 9 };
		boolean f = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					f = true;
					break;
				}

			}
			if (f == true) {
				break;
			}
		}

	}

}
