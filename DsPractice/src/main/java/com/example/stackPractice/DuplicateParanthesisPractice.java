package com.example.stackPractice;

import java.util.Stack;

public class DuplicateParanthesisPractice {

    public static void main(String[] args) {
        if(findDuplicateParanthesis()){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
    static  boolean findDuplicateParanthesis(){
        String str = "((a+(b))+(c+d))";
        Stack<Character> stack = new Stack();
        char[] ch = str.toCharArray();
        for(char c:ch){
            if(c!=')'){
                stack.push(c);
            }else{
                char top =stack.pop();
                int idx=0;
                while (top!='('){
                    idx++;
                    top=stack.pop();
                }if(idx<1){
                    return true;
                }
            }
        }
        return false;
    }
}