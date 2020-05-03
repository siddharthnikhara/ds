package com.example.demo.arrayPractice;

public class SearchMax {

	public static void main(String[] args) {
		int a[] = { 1, 7, 2, 4, 5, 9, 10 };
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Max no is:  "+max);
				
	}

}
