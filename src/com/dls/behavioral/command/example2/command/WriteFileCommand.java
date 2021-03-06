package com.dls.behavioral.command.example2.command;

import com.dls.behavioral.command.example2.receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
