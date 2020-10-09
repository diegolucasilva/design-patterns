package com.dls.creational.abstactfactory.factories;

import com.dls.creational.abstactfactory.buttons.WindowsButton;
import com.dls.creational.abstactfactory.checkboxes.WindowsCheckbox;
import com.dls.creational.abstactfactory.buttons.Button;
import com.dls.creational.abstactfactory.checkboxes.Checkbox;
public class WindowsFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}