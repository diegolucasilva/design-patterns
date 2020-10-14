package com.dls.behavioral.memento.example2;

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String file, StringBuilder content){
        this.fileName=file;
        //notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
        this.content=new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }
    public StringBuilder getContent() {
        return content;
    }

}
