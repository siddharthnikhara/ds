package com.example.arrayPractice;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int a[] = {10, 5, 30, 2, 40, 60};
        int no = 30;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == no) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }

            }
        }
        for (int a1 : a) {
            System.out.print(a1 + " ");
        }
    }
}
