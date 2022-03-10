package com.vanessa.topic2.controllers;

import com.vanessa.topic2.dataTransferObject.PrintRequestDataTransferObject;
import com.vanessa.topic2.models.FilePrint;
import com.vanessa.topic2.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;


@RestController
@RequestMapping(value = "/print")
public class ControllerP {
    private final HashMap<String, Boolean> printersList = new HashMap<>();

    @Autowired
    private PrinterService printerService;

    // load the list of printers
    public void loadPrinters() {
        // Key:name printer, value: (Print color) true/false.
        printersList.put("Printer #1:(Black And White)", false);
        printersList.put("Printer #2: (Color)", true);
    }

    @PostMapping
    public ResponseEntity doPrint(@RequestBody PrintRequestDataTransferObject printRequest) {
        FilePrint filePrint;
        boolean printerColor;
        switch (printRequest.getFileType()) {
            case "image":
                filePrint = new FilePrint(FilePrint.IMAGE);
                break;
            case "wordDoc":
                filePrint = new FilePrint(FilePrint.WORD, printRequest.getMessageText());
                break;
            case "pdf":
                filePrint = new FilePrint(FilePrint.PDF, printRequest.getMessageText());
                break;
            case "txt":
                filePrint = new FilePrint(FilePrint.TXT, printRequest.getMessageText());
                break;
            default:
                return new ResponseEntity("Wrong file type", HttpStatus.BAD_REQUEST);
        }
        if (printersList.isEmpty())
            loadPrinters();
        if (!printersList.containsKey(printRequest.getPrinter())) {
            String msjError = "Error when selecting the printer." +
                    "\nThese are the available printers: " + printersList.keySet();
            return new ResponseEntity(msjError, HttpStatus.BAD_REQUEST);
        }
        printerColor = printersList.get(printRequest.getPrinter());
        try {
            printerService.toPrint(filePrint, printerColor);
            return new ResponseEntity("file printed at root directory", HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
