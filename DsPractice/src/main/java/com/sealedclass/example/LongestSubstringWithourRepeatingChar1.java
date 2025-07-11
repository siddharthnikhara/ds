package com.sealedclass.example;

public class LongestSubstringWithourRepeatingChar1 {
    public static void main(String[] args) {
        String s = "reyedgergbdf";
        System.out.println(longestSubstringWithoutRepeatingChar(s));

    }
    static String longestSubstringWithoutRepeatingChar(String s){
        String result = "";
        for(char c: s.toCharArray()){
            String test = s.valueOf(c);
            if(result.contains(test)){
                result = result.substring(result.indexOf(test) +1);
            }
            result = result+test;

        }
        return result;
    }
}
