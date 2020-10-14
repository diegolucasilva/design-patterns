package com.dls.behavioral.memento.example2;
/*
Memento is a behavioral design pattern that lets you save and restore the previous
state of an object without revealing the details of its implementation.

EX:
All java.io.Serializable implementations can simulate the Mement
 */
public class Main {

    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println(fileWriter+"\n\n");

        // lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");

        //checking file contents
        System.out.println(fileWriter+"\n\n");

        //lets undo to last save
        caretaker.undo(fileWriter);

        //checking file content again
        System.out.println(fileWriter+"\n\n");
    }
}
