package com.example.recursion;

import java.util.ArrayList;

public class PrintSubSet {
    public static void main(String[] args) {
        printSubSet(3,new ArrayList<>());
    }
    static void printSubSet(int n, ArrayList<Integer> list){
        if(n==0){
            print(list);
            return;
        }
        //add
        list.add(n);
        printSubSet(n-1,list);

        //remove
        list.remove(list.size()-1);
        printSubSet(n-1,list);

    }

    private static void print(ArrayList<Integer> list) {
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
