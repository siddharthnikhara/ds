package com.example.recursion;

import java.util.HashSet;

public class UniqueSubsequencesOfString {
    public static void main(String[] args) {
        HashSet<String> set  = new HashSet<>();
        subsequencesOfString("aaa",0,"",set);
    }
    static void subsequencesOfString(String str, int idx, String newString, HashSet<String> set){
        if(str.length()==idx){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char ch = str.charAt(idx);

        //to be
        subsequencesOfString(str,idx+1,newString+ch, set);
        //not to be
        subsequencesOfString(str,idx+1,newString, set);
    }
}