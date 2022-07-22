package com.example.recursion;

public class PrintKeypadCombination {
    static String[]  keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        String str = "4";
        String combination = "";
        printCombination(str,0,combination);
    }
    static void printCombination(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char ch = str.charAt(idx);
        String mapping = keypad[ch-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombination(str,idx+1,combination+mapping.charAt(i));
        }
    }
}