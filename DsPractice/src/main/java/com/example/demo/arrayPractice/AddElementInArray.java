package com.example.demo.arrayPractice;

public class AddElementInArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,50,60};
		int pos=3;
		int no=40;
		for(int i=a.length-1;pos-1<i;i--) {
			a[i]=a[i-1];
		}
		a[pos]=no;
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

}
