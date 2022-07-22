package com.example.stackPractice;

import java.util.Stack;

public class CountNAturalNumberPractice {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(countNumber(n));
    }
    static int countNumber(int n) {
        int result=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=9;i++){
            if(i<=n){
                stack.push(i);
                result++;
            }while (!stack.isEmpty()){
                int tp=stack.pop();
                for(int j=tp%10;j<=9;j++){
                    int x = tp*10+j;
                    if(x<=n){
                        stack.push(x);
                        result++;
                    }
                }
            }
        }
        return result;
    }
}