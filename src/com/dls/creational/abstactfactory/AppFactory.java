package com.dls.creational.abstactfactory;

import com.dls.creational.abstactfactory.buttons.Button;
import com.dls.creational.abstactfactory.checkboxes.Checkbox;
import com.dls.creational.abstactfactory.factories.GUIFactory;


public class AppFactory {
    private Button button;
    private Checkbox checkbox;


    public AppFactory(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
