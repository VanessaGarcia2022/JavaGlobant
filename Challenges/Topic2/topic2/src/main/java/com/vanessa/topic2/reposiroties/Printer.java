package com.vanessa.topic2.reposiroties;

import com.vanessa.topic2.models.FilePrint;

import java.io.IOException;

public interface Printer {
    String filename = "printed";
    void print(FilePrint fileToPrint) throws IOException;
}
