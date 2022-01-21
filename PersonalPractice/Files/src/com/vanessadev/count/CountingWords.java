package com.vanessadev.count;
import org.w3c.dom.html.HTMLParagraphElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingWords {
    public String[] readFile(File file){
        String lines = "";
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                lines += sc.nextLine();
            }
        }catch (FileNotFoundException e) {
            System.out.println("File exception: "+e);
        }

        return lines.split(" ");
    }
    public boolean showResult(int words, String[] lines){
        boolean result = false;
        File file =  new File("result.txt"); // create a new file
        try {
            FileWriter fileWriter = new FileWriter(file);
            String tmp = ""; // string to store the content
            for (String line: lines) {
                tmp += line;
                tmp += " ";
            }
            fileWriter.write("The file has " + words + " words" + "\n" + tmp);
            fileWriter.close();
            result = true;
        }catch (IOException e ){
            System.out.println("Error to create the file " + e);
        }
        return result;
    }
}
