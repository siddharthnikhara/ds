package com.example.string;

import java.util.Arrays;

public class nextPermutation {

    public static void swap(int data[], int left, int right) {
		int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }

    public static void reverse(int data[], int left, int right) {
		while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }
    }

    public static boolean findNextPermutation(int data[]) {
        if (data.length <= 1) {
            return false;
        }
        int last = data.length - 2;
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }
        if (last < 0) {
            return false;
        }
        int nextGreater = data.length - 1;
		for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }
		swap(data, nextGreater, last);
        reverse(data, last + 1, data.length - 1);
		return true;
    }
	public static void main(String args[]) {
        int data[] = {1, 2, 3, 6, 5, 4};
        if (!findNextPermutation(data))
            System.out.println("There is no higher"
                    + " order permutation "
                    + "for the given data.");
        else {
            System.out.println(Arrays.toString(data));
        }
    }
}
