package com.software.designpatterns.abstractfactory.impl;

import com.software.designpatterns.abstractfactory.iface.Wing;

public class GaWing implements Wing {

    @Override
    public String getWingParts() {
        return "Wing parts for general aviation aircraft.";
    }
}