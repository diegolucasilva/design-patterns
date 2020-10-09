package com.dls.creational.abstactfactory.factories;

import com.dls.creational.abstactfactory.buttons.Button;
import com.dls.creational.abstactfactory.checkboxes.Checkbox;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public abstract class GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();


    public static GUIFactory getGUIFactory(String type) {
        if (type.equals("Windows 10")) {
            return new WindowsFactory();
        }
        else if(type.equals("mac")) {
            return new MacOSFactory();
        }
        return null;
    }
}
