package com.example.string;

public class ShuffleSubStringOfAnotherString {

    static boolean compare(int[] arr1, int[] arr2) {
        for (int i = 0; i < 256; i++)
            if (arr1[i] != arr2[i]) {
                return false;
            }
        return true;
    }

    static boolean search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int[] countP = new int[256];
        int[] countTW = new int[256];

        for (int i = 0; i < M; i++) {
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }
        for (int i = M; i < N; i++) {
            if (compare(countP, countTW)) {
                return true;
            }
            (countTW[txt.charAt(i)])++;
            countTW[txt.charAt(i - M)]--;
        }
        if (compare(countP, countTW)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        if (search(pat, txt)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}