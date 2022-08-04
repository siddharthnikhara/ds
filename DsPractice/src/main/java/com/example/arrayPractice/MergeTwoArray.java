package com.example.arrayPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MergeTwoArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60, 70, 80 };
		int a_length = a.length;
		int b_length = b.length;
		int c = a_length + b_length;

		int[] c_array = new int[c];

		for (int i = 0; i < a.length; i++) {
			c_array[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c_array[a_length + j] = b[j];

		}
		for (int c1: c_array) {
			System.out.print(c1 + " ");
		}
	}
}
