package com.example.string;

import java.util.ArrayList;
import java.util.List;

public class FindAllStringRotations {

    public static List<String> generateAllRotations(String s) {
        List<String> rotations = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String rotation = s.substring(i) + s.substring(0, i);
            rotations.add(rotation);
        }

        return rotations;
    }

    public static void main(String[] args) {
        String input = "geeks";
        List<String> result = generateAllRotations(input);

        System.out.println("All rotations of \"" + input + "\":");
        for (String r : result) {
            System.out.println(r);
        }
    }
}
