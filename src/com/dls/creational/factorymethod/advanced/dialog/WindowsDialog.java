package com.dls.creational.factorymethod.advanced.dialog;

import com.dls.creational.factorymethod.advanced.dialog.buttons.Button;
import com.dls.creational.factorymethod.advanced.dialog.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
