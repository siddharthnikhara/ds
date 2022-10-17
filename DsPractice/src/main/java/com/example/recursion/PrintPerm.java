package com.example.recursion;

public class PrintPerm {
    public static void main(String[] args) {
        printPerm("abc","");
    }
    static void printPerm(String str, String printPerm){
        if(str.length()==0){
            System.out.println(printPerm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            //--->"ab" "ca'
           printPerm(str.substring(0,i)+str.substring(i+1),currChar+printPerm);
        }
    }
}
//O(n)
