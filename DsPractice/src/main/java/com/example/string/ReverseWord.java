package com.example.string;

import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
//        String s = "a good   example";
//        System.out.println(reverseWords(s));
        String nu = "52";
        System.out.println(largestOddNumber(nu));
    }

    public static String reverseWords(String s) {
        String a[] = s.split(" ");
        String ans = "";
        Stack stack = new Stack();
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }

        while (!stack.isEmpty()) {
            Object word = stack.pop();
            if(stack.isEmpty() && !word.toString().isBlank()) {
                ans = ans + word;
            }else if(!word.toString().isEmpty()){
                ans = ans + word + " ";
            }
        }
        return ans.trim();
    }

    public static String largestOddNumber(String num) {
        String ans = "";
        String arr[] = new String[num.length()];
        for(int i = 0;i<num.length();i++){
            arr[i] = num.substring(0,i);
        }
        for(String s: arr){
            if(Long.valueOf(s)%2 != 0){
                ans = s;
            }
        }
        return ans;
    }
}
