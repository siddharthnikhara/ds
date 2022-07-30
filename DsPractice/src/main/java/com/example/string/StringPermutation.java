package com.example.string;

public class StringPermutation {

    static void printPermutn(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        printPermutn(s, "");
    }
}
