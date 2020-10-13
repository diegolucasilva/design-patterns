package com.dls.behavioral.command.example2;

import com.dls.behavioral.command.example2.command.CloseFileCommand;
import com.dls.behavioral.command.example2.command.OpenFileCommand;
import com.dls.behavioral.command.example2.command.WriteFileCommand;
import com.dls.behavioral.command.example2.invoker.FileInvoker;
import com.dls.behavioral.command.example2.receiver.FileSystemReceiver;
import com.dls.behavioral.command.example2.receiver.UnixFileSystemReceiver;
import com.dls.behavioral.command.example2.receiver.WindowsFileSystemReceiver;

public class Main {
    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }
}
