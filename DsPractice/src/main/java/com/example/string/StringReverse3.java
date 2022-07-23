package com.example.string;

public class StringReverse3 {
    public static void main(String[] args) {
        String input = "GeeksForGeeks";
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }
    }
}
