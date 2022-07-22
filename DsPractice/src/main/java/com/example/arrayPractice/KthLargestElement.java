package com.example.arrayPractice;

public class KthLargestElement {

	public static void main(String[] args) {
		int a[] = { 1, 7, 55, 88, 4, 6, 99, 10, 23 };
		int k = 3;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.print(a[i]+"\n");
				break;
			}
		}
		
		for(int a1:a) {
			
			System.out.println(a1);
		}
	}

}
