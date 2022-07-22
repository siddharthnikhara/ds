package com.example.recursion;

public class StringInReverseUsingRecusrion {
    public static void main(String[] args) {
        stringInReverseUsingRecusrion("abcd",4);
        System.out.println();
        String s="abcd";
        printRev(s,s.length()-1);
    }
    static void stringInReverseUsingRecusrion(String s, int h){
        if(h==0){
            return;
        }
        char ch[]=s.toCharArray();
        System.out.print(ch[h-1]);
        stringInReverseUsingRecusrion(s,h-1);
    }

    static void printRev(String s, int h){
        if(h==0){
            System.out.print(s.charAt(h));
            return;
        }
        System.out.print(s.charAt(h));
        printRev(s,h-1);
    }
}