//package com.example.string;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class GFG {
//
//    static String Minimum_Window(char[] s, char[] t) {
//        int count = 0;
//        Map<Character, Integer> pat = new HashMap<>();
//        Map<Character, Integer> str = new HashMap<>();
//
//        for (char c : t) {
//            if (pat.containsKey(c)) {
//                pat.put(c, pat.get(c) + 1);
//            } else {
//                pat.put(c, 1);
//            }
//            int start = 0;
//            int idx = -1;
//            for (int j = 0; j < s.length; j++) {
//
//                char c1 = s[j];
//                if (str.containsKey(c)) {
//                    str.put(c, str.get(c) + 1);
//                } else {
//                    str.put(c, 1);
//                }
//                if(str.get(c)<=pat.get(c)){
//                    count++;
//                }
//                if(count == t.length){
//                    while (str.get(s[start>pat[start]))
//                }
//            }
//        }
//        return "";
//    }
//
//    public static void main(String[] args) {
//        String s = "ADOBECODEBANC";
//        String t = "ABC";
//        System.out.print(Minimum_Window(s.toCharArray(), t.toCharArray()));
//    }
//}
//
////class GFG {
////
////    static String Minimum_Window(char[] s, char[] t) {
////        int m[] = new int[256];
////        // Answer
////        int ans = Integer.MAX_VALUE; // length of ans
////        int start = 0; // starting index of ans
////        int count = 0;
////        // creating map
////        for (int i = 0; i < t.length; i++) {
////            if (m[t[i]] == 0)
////                count++;
////            m[t[i]]++;
////        }
////        int i = 0;
////        int j = 0;
////        // Traversing the window
////        while (j < s.length) {
////            // Calculations
////            m[s[j]]--;
////            if (m[s[j]] == 0)
////                count--;
////            // Condition matching
////            if (count == 0) {
////                while (count == 0) {
////                    // Sorting ans
////                    if (ans > j - i + 1) {
////                        ans = Math.min(ans, j - i + 1);
////                        start = i;
////                    }
////                    // Sliding I
////                    // Calculation for removing I
////                    m[s[i]]++;
////                    if (m[s[i]] > 0)
////                        count++;
////                    i++;
////                }
////            }
////            j++;
////        }
////        if (ans != Integer.MAX_VALUE) {
////            return String.valueOf(s).substring(start, ans + start);
////        } else {
////            return "-1";
////        }
////    }
////
////    public static void main(String[] args) {
////        String s = "ADOBECODEBANC";
////        String t = "ABC";
////        System.out.print("-->Smallest window that contain all character : ");
////        System.out.print(Minimum_Window(s.toCharArray(), t.toCharArray()));
////    }
////}