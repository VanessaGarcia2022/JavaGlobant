package com.vanessa.topic2.reposiroties;

import com.vanessa.topic2.models.FilePrint;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Repository //vuelve la clase un singleton y permite la inyección de dependencias
public class PrinterColor implements Printer{

    @Override
    public void print(FilePrint fileToPrint) throws IOException {
        String detail = "----\tColor print\t----\n";
        if (!fileToPrint.getTypeDoc().equals(FilePrint.IMAGE)) {
            try {
                Files.write(Paths.get(filename + "." + fileToPrint.getTypeDoc() + ".txt")
                        , (detail + fileToPrint.getText()).getBytes()
                        , StandardOpenOption.CREATE);
            } catch (Exception e) {
                System.err.println("-- file not printed, error ocurred:\t" + e.getMessage());
                throw new IOException("file not printed, error ocurred");
            } finally {
                return;
            }
        }
        try {
            Files.write(Paths.get(filename + "Image.txt")
                    , (detail + "this file represents a image printed").getBytes()
                    , StandardOpenOption.CREATE);
        } catch (Exception e) {
            System.err.println("-- file not printed, error ocurred:\t" + e.getMessage());
            throw new IOException("file not printed, error ocurred");
        }
    }
}
