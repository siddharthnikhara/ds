package com.example.string;

public class LongestRepeatingCharacterReplacement {

    static int findLen(String A, int n, int k, char ch) {
        int maxlen = 1;
        int cnt = 0;
        int l = 0, r = 0;

        while (r < n) {
            if (A.charAt(r) != ch)
                ++cnt;

            while (cnt > k) {
                if (A.charAt(l) != ch) {
                    --cnt;
                }
                ++l;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            ++r;
        }
        return maxlen;
    }

    static int answer(String A, int n, int k) {
        int maxlen = 1;
        for (int i = 0; i < 26; ++i) {
            maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i + 'A')));
            maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i + 'a')));
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        String A = "ABABA";
        System.out.println("Maximum length = " + answer(A, n, k));

        n = 6;
        k = 4;
        String B = "HHHHHH";
        System.out.println("Maximum length = " + answer(B, n, k));
    }
}
