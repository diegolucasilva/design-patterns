package com.dls.creational.factorymethod.advanced.factory;


import com.dls.creational.factorymethod.advanced.dialog.Dialog;
import com.dls.creational.factorymethod.advanced.dialog.HtmlDialog;
import com.dls.creational.factorymethod.advanced.dialog.WindowsDialog;

public class DialogFactory {

    public static Dialog getDialog(String type) {
        if (type.equals("Windows 10")) {
            return new WindowsDialog();
        }
        return new HtmlDialog();
    }
}
