package com.dls.creational.abstactfactory.factories;

import com.dls.creational.abstactfactory.buttons.MacOSButton;
import com.dls.creational.abstactfactory.checkboxes.MacOSCheckbox;
import com.dls.creational.abstactfactory.buttons.Button;
import com.dls.creational.abstactfactory.checkboxes.Checkbox;
/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}