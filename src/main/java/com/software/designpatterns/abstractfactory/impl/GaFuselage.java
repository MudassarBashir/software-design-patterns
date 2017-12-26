package com.software.designpatterns.abstractfactory.impl;

import com.software.designpatterns.abstractfactory.iface.Fuselage;

public class GaFuselage implements Fuselage {

    @Override
    public String getFuselageParts() {
        return "Fuselage parts for general aviation aircraft.";
    }
}
