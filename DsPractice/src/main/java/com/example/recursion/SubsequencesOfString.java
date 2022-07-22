package com.example.recursion;

public class SubsequencesOfString {
    public static void main(String[] args) {
        subsequencesOfString("abc",0,"");
    }
    static void subsequencesOfString(String str, int idx, String newString){
        if(str.length()==idx){
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(idx);
        //to be
        subsequencesOfString(str,idx+1,newString+ch);
        //not to be
        subsequencesOfString(str,idx+1,newString);
    }
}
