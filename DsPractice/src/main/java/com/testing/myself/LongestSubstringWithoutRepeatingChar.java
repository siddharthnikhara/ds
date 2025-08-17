package com.testing.myself;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "pwekewqrt";
        String test = "";
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            String cur = String.valueOf(str.charAt(i));
            if (test.contains(cur)) {
                test = test.substring(test.indexOf(cur)+1);
            }
            test += cur;
            len = Math.max(test.length(), len);
        }
        System.out.println(test);
    }


}

