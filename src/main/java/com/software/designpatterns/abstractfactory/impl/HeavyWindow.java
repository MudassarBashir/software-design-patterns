package com.software.designpatterns.abstractfactory.impl;

import com.software.designpatterns.abstractfactory.iface.Window;

public class HeavyWindow implements Window {

    @Override
    public String getWindowParts() {
        return "Window parts for heavy aircraft.";
    }
}
