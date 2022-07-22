package com.example.recursion;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        firstAndLastOccurance("abaacdaefaah", 'a', -1, -1, 0);
    }

    static void firstAndLastOccurance(String input, char findElement, int first, int last, int index) {
        if (index == input.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (input.charAt(index) == findElement) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        firstAndLastOccurance(input, findElement, first, last, index + 1);
    }
}