package com.example.demo.arrayPractice;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInThreeSortedArrays {
	public static void main(String[] args) {
		int[] a = { 1, 5, 7, 9 };
		int[] b = { 2, 7, 9, 11, 64 };
		int[] c = { 7, 9, 11, 58, 64 };
		int x = 0, y = 0, z = 0;
		List<Integer> list = new ArrayList<>();

		while (x < a.length && y < b.length && z < c.length) {
			if (a[x] == b[y] && b[y] == c[z]) {
				list.add(a[x]);
				x++;
				y++;
				z++;
			} else if (a[x] < b[y]) {
				x++;
			} else if (b[y] < c[z]) {
				y++;
			} else {
				z++;
			}
		}
		
		for(int q:list) {
			System.out.print(q+"  ");
		}
	}
}
