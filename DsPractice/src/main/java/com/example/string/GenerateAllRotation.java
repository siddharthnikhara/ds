//package com.example.string;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class GenerateAllRotation {
//    public static void main(String[] args) {
//        String S = "geeks";
//        generateAllRotation(S);
//    }
//
//    static void generateAllRotation(String s) {
//        int i, length = s.length();
//        Queue<String> q = new LinkedList<>();
//        String s1 = "";
//        for (i = 0; i < length; i++) {
//            if (q.isEmpty()) {
//                q.add(s.substring(i));
//                s1 += s.charAt(i);
//            }else{
//                q.add(s.substring(i)+s1);
//                s1 += s.charAt(i);
//            }
//        }
//        System.out.println(q);
//    }
//}
