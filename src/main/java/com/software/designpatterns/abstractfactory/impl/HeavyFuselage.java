package com.software.designpatterns.abstractfactory.impl;

import com.software.designpatterns.abstractfactory.iface.Fuselage;

public class HeavyFuselage implements Fuselage {

    @Override
    public String getFuselageParts() {
        return "Fuselage parts for heavy aircraft.";
    }
}
