package com.example.arrayPractice;

import java.util.HashSet;
import java.util.Set;

public abstract class FirstDuplicateElement {

	public static void main(String[] args) {
		int a[]= {5,5,12,4,7,4,2,1,7};
		int temp=-1;
		Set<Integer>set = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(a[i])) {
				temp = i;
				break;
			}else {
				set.add(a[i]);
			}
		}if(temp==-1)
			System.out.println("There is no duplicate");
		else
			System.out.println("First duplicate:  "+a[temp]);
	}

}
