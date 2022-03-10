package com.vanessa.topic2.models;

public class FilePrint {
    public static final String PDF = "pdf";
    public static final String IMAGE = "image";
    public static final String WORD = "docx";
    public static final String TXT = "txt";

    private String typeDoc;
    private String text;

    public FilePrint(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public FilePrint(String typeDoc, String text) {
        this.typeDoc = typeDoc;
        this.text = text;
    }

    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
