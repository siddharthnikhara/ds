package com.example.hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(s).forEach(System.out::println);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String sortedArray = String.valueOf(tempArray);
            if (!map.containsKey(sortedArray)) {
                map.put(sortedArray, new ArrayList<>());
            }
            map.get(sortedArray).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}