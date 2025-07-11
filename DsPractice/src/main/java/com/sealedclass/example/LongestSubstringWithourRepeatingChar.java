package com.sealedclass.example;

public class LongestSubstringWithourRepeatingChar {
    public static void main(String[] args) {
        String test = "";
        String s = "reyedgergbdf";
        for(char c: s.toCharArray()){
            String c1 = s.valueOf(c);
            if(test.contains(c1)){
                test = test.substring(test.indexOf(c1)+1);
            }
            test = test + c1;
        }
        System.out.println(test);
    }
}
