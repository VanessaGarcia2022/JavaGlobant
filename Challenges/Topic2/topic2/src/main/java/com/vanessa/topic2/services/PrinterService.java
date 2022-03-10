package com.vanessa.topic2.services;

import com.vanessa.topic2.models.FilePrint;

import java.io.IOException;

public interface PrinterService {
    void toPrint(FilePrint fileToPrint, boolean isColorPrint) throws IOException;
}
