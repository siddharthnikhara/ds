package com.example.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi("s","h","d",3);
    }
    static void towerOfHanoi(String source, String helper, String destination,int h){
        if(h==1){
            System.out.println("transfer disk "+h+" source "+source+" destination "+destination);
            return;
        }
        towerOfHanoi(source,destination,helper,h-1);
        System.out.println("transfer disk "+h+" source "+source+" destination "+destination);
        towerOfHanoi(helper,source,destination,h-1);
    }
}

//time complexity O(2^n)
