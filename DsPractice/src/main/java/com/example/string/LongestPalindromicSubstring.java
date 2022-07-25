package com.example.string;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "ac";
        System.out.println(longestPalindromicSubstring(s));
    }

    static String longestPalindromicSubstring(String s) {
        if(s.length()==0){
            return s;
        }
        List<String> list = new ArrayList<>();
        int size =0;
        String res = "";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=0;j--){
                if(i<j && s.charAt(i)==s.charAt(j)){
                   String s1= isPalindrome(s,i,j);
                    if(size <= s1.length()){
                        size = s1.length();
                        list.add(isPalindrome(s,i,j));
                        break;
                    }

                }
            }
        }
        if(!list.isEmpty()) {
            String s1 = "";
            for (int i = 0; i < list.size(); i++) {
                if (size <= list.get(i).length()) {
                    s1 = list.get(i);
                    size = list.get(i).length();
                }
                return s1;
            }
        }else{
            return s.charAt(0)+"";
        }
        return null;
    }

    private static String isPalindrome(String s, int i, int j) {
        if (s.isEmpty()) {
            return null;
        }
        String s1 =s.substring(i,j+1);
        String str = s1.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        String rstr = revstr.toString();
        if (str.equals(rstr)) {
            return str;
        }
       return null;
    }
}
