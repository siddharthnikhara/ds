package com.example.string;

import java.util.*;

public class ShuffleSubStringOfAnotherStringBruteForce {

    static boolean isShuffledSubString(String A, String B) {
        int n = A.length();
        int m = B.length();
        if (n > m) {
            return false;
        } else {
            A = sort(A);
            for (int i = 0; i < m; i++) {
                if (i + n - 1 >= m) {
                    return false;
                }
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += B.charAt(i + j);
                }
                str = sort(str);
                if (str.equals(A)) {
                    return true;
                }
            }
        }
        return false;
    }

    static String sort(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return String.valueOf(tempArray);
    }

    public static void main(String[] args) {
        String str1 = "yellow";
        String str2 = "roseyellow";
        boolean a = isShuffledSubString(str1, str2);
        if (a) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        System.out.println();
    }
}