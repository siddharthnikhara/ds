package com.example.arrayPractice;
import java.util.HashMap;
import java.util.Map;

public class SameArrayLengthAndElement {

	public static void main(String[] args) {
		int a[] = { 10, 1, 4, 8, 9, 11, 12, 3 };
		int b[] = { 8, 4, 9, 1, 10, 11, 12, 3, 7 };
		Map<Integer, Integer> map = values(a);
		boolean f = false;
		for (int i = 0; i < b.length; i++) {
			if (map.containsKey(b[i]) && map.get(b[i]) == 1) {
				map.remove(b[i]);
			} else if ((map.containsKey(b[i])) && map.get(b[i]) > 1) {
				map.put(b[i], map.get(b[i]) - 1);
			} else {
				f = true;
				break;
			}

		}
		if (map.isEmpty() && f == false) {
			System.out.println("arrays are  having same element");
		} else {
			System.out.println("arrays are not having same element");
		}

	}

	static Map values(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		return map;
	}
}
