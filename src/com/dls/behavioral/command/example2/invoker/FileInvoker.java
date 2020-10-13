package com.dls.behavioral.command.example2.invoker;

import com.dls.behavioral.command.example2.command.Command;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}