package com.example.string;

import java.util.HashMap;

public class IsomorphicStrings {

        public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check s → t mapping
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) return false;
            } else {
                mapST.put(c1, c2);
            }

            // Check t → s mapping
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) return false;
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));     // true
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}
