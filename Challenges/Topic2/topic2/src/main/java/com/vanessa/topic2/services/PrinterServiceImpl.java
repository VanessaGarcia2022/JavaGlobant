package com.vanessa.topic2.services;


import com.vanessa.topic2.models.FilePrint;
import com.vanessa.topic2.reposiroties.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service // logica del negocio, tambien son singleton
public class PrinterServiceImpl implements PrinterService{

    @Qualifier("printerColor") //Identificador
    @Autowired // inyección de dependencia Printer
    private Printer printerBW ;

    @Qualifier("printerColor")
    @Autowired
    private Printer printerColor;

    @Override
    public void toPrint(FilePrint fileToPrint, boolean isColorPrint) throws IOException {
        if (isColorPrint)
            printerColor.print(fileToPrint);
        else
            printerBW.print(fileToPrint);
    }

}
