package com.example.string;

public class StringPermutations {

    // Method to print all permutations
    public static void printPermutations(String str) {
        generatePermutations("", str);
    }

    // Recursive helper method
    private static void generatePermutations(String prefix, String remaining) {
        int n = remaining.length();

        // Base case: when no characters are left to permute
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                // Fix the character at index i and permute the rest
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutations(newPrefix, newRemaining);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        printPermutations(input);
    }
}
