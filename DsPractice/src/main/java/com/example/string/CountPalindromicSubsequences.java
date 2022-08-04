//package com.example.string;
//
//public class CountPalindromicSubsequences {
//    public static void main(String[] args) {
//        System.out.println(findCountPalindromicSubsequences("aaaa"));
//    }
//    static long findCountPalindromicSubsequences(String str){
//        char ch[]= str.toCharArray();
//        int idx=0;
//        String res ="";
//        for(char c:ch){
//            if(res.contains(c+"")){
//                idx = idx+2;
//                res = res+c;
//            }else{
//                idx = idx+1;
//                res = res+c;
//            }
//        }
//        return idx;
//    }
//}
