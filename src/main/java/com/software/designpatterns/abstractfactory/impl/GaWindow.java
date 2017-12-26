package com.software.designpatterns.abstractfactory.impl;

import com.software.designpatterns.abstractfactory.iface.Window;

public class GaWindow implements Window {

    @Override
    public String getWindowParts() {
        return "Window parts for general aviation aircraft.";
    }
}
