package com.july.sorting;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "senetence9 is2 a3 this1";
       /* String[] arr = s.split(" ");
        Map<Character, String> map = new TreeMap();
        for(String s1 : arr){
            map.put(s1.charAt(s1.length()-1), s1.substring(0, s1.length()-1));
        }
        List l = map.entrySet().stream().map(it -> it.getValue()).collect(Collectors.toList());
        String s2 = "";
        for(Object s1:l){
            s2 += s1+" ";
        }*/
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '0'; // extract the numeric index
            sortedWords[index - 1] = word.substring(0, word.length() - 1); // place word in correct index
        }

        return String.join(" ", sortedWords); // join sorted words into a single sentence
    }
}
