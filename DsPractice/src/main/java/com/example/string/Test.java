package com.example.string;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        writeResult();
    }

    public static void writeResult() {
        try {
            FileReader fr = new FileReader("/Users/siddharthneekhara/Desktop/file.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String s = " \\n";
            String line;
            int idx=0;
            while ((line = bufferedReader.readLine()) != null) {
                if(idx == 0) {
                    idx++;
                    sb.append(line);
                }else{
                    sb.append(s);
                    sb.append(line);
                }
            }
            Path path = Paths.get("/Users/siddharthneekhara/Desktop/file1.txt");
            try {
                Files.writeString(path, sb.toString(), StandardCharsets.UTF_8);
                //Files.writeString(path, sb.toString(), StandardCharsets.UTF_8);
            }catch (IOException ex) {
                System.out.print("Invalid Path");
            }

            bufferedReader.close();

        } catch (IOException ex) {
            System.out.println("Error writing to file '" + "'");
        }
    }
}