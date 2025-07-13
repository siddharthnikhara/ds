package com.example.string;

public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;  // keep track of balance

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    result.append(c);  // skip the outermost '('
                }
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    result.append(c);  // skip the outermost ')'
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(input));  // Output: ()()()()(())
    }
}
