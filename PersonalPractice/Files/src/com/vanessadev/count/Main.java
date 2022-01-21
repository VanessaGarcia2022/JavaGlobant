package com.vanessadev.count;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        CountingWords count = new CountingWords();
        File file =  new File("lorem"); // read the original file
        String [] lines = count.readFile(file);
        int words = lines.length;
        boolean result = count.showResult(words, lines);
        if (result) {
            System.out.println("The program ran successfully");
        }else{
            System.out.println("An error occurred in the execution");
        }
    }
}
