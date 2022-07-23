package com.example.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(longestSubstringWithoutRepeatingChar(s));
    }

    static int longestSubstringWithoutRepeatingChar(String s) {
        int size = 0;
        List<String> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int i, length = s.length();
        String sb = "";
        for (i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))) {
                list.add(sb);
                map.clear();;
                sb = ""+s.charAt(i);
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), 1);
                sb = sb+s.charAt(i);
            }
        }
        list.add(sb);
        for (int j = 0; j < list.size(); j++) {
            int le = list.get(j).length();
            if (size < le) {
                size = le;
            }
        }
        return size;
    }
}
