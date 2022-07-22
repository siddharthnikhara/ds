package com.example.recursion;

public class FactorialOfNno {
    public static void main(String[] args) {
        System.out.println(factorialOfNno(5));
    }
    static int factorialOfNno(int n){
        if(n==0 || n==1){
            return 1;
        }
        int factorialN_1=factorialOfNno(n-1);
        int factorial = n*factorialN_1;
        return factorial;
    }
}
