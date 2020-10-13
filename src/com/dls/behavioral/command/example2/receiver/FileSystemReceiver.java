package com.dls.behavioral.command.example2.receiver;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}