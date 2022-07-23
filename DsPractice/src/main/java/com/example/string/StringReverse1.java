package com.example.string;

class StringReverse1 {
    public static void main(String[] args) {
        String str = "Geeks", nstr = "";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Geeks");
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }
}