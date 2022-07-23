package com.example.string;

import java.util.Scanner;

public class StringReverse4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        String rev = "";
        for (int i = Str.length() - 1; i >= 0; i--) {
            rev = rev + Str.charAt(i);
        }
        System.out.println(rev);
    }
}
	
