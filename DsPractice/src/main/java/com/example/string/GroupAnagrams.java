package com.example.string;

import java.util.*;

public class GroupAnagrams {

    private static List<List<String>> printAnagrams(String arr[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            } else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String s : map.keySet()) {
            result.add(map.get(s));
        }
        return result;
    }

    public static void main(String[] args) {
        String arr[] = {"cat", "dog", "tac", "ogd", "act","bat"};
        System.out.println(printAnagrams(arr));
    }
}
