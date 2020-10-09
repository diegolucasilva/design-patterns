package com.dls.creational.factorymethod.advanced;

import com.dls.creational.factorymethod.advanced.dialog.Dialog;
import com.dls.creational.factorymethod.advanced.factory.DialogFactory;

/*
Creational design pattern which solves the problem of creating product objects without specifying their concrete classes.
EX:java.util.Calendar#getInstance()
 */

public class Main {

    private static DialogFactory dialogFactory;

    public static void main(String[] args) {
       Dialog dialog = DialogFactory.getDialog("Windows 10") ;
       dialog.renderWindow();
    }
}
