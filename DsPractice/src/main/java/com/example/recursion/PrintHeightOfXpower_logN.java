package com.example.recursion;

public class PrintHeightOfXpower_logN {
    public static void main(String[] args) {
        System.out.println(calPower(2,5));
    }
    static int calPower(int data, int height){
        if(height==0) {
            return 1;
        }
        if(data==0){
            return 0;
        }
        if(height%2==0){
            return  calPower(data,height/2) * calPower(data,height/2);
        }else{
            return calPower(data,height/2) * calPower(data,height/2)*data;
        }
    }

}