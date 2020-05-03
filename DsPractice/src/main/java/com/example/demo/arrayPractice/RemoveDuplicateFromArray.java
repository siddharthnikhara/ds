package com.example.demo.arrayPractice;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,4,4,5};
		int[] temp = new int[a.length];
		
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			System.out.print(temp[i]+" ");
		}

	}

}
