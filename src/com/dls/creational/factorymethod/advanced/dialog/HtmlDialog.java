package com.dls.creational.factorymethod.advanced.dialog;

import com.dls.creational.factorymethod.advanced.dialog.buttons.Button;
import com.dls.creational.factorymethod.advanced.dialog.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}