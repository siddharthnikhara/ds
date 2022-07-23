package com.example.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       // String s[] = {"flower", "flow", "flight"};
        String s1[] = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(s1));
    }

    public static String longestCommonPrefix(String[] strs) {
        String mResult = "";
        String cStr = strs[0];
        for (int j = 1; j < strs.length; j++) {
            String s = strs[j];
            for (int i = 0; i < s.length(); i++) {
                if (cStr.charAt(i) == s.charAt(i)) {
                    mResult += s.charAt(i);
                } else {
                    break;
                }
            }
            if(!mResult.isEmpty()) {
                cStr = mResult;
            }
            if (j != strs.length - 1) {
                mResult = "";
            }
        }
        return mResult;
    }
}
