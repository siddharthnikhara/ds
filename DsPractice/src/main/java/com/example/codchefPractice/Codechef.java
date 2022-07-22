package com.example.codchefPractice;

import java.util.Scanner;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			long arr = s.nextLong();
			sum = sum + arr;
		}
		System.out.println(sum);
	}
}