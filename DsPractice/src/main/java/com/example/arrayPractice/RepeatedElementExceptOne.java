package com.example.arrayPractice;

import java.util.HashMap;
import java.util.Map;

public class RepeatedElementExceptOne {

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
