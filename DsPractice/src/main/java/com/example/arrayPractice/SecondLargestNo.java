package com.example.arrayPractice;

public class SecondLargestNo {

	public static void main(String[] args) {
		int largest_No=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		int a[]= {50,117,8,3,10,40,515};
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest_No) {
				second_largest=largest_No;
				largest_No=a[i];		
			}else if(a[i]>second_largest && a[i]!=largest_No) {
				second_largest=a[i];
			}
		}if(second_largest==Integer.MIN_VALUE) {
			System.out.println("There is no second largest value.");
		}else {
			System.out.println(" second largest value:  "+second_largest);
		}

	}

}
