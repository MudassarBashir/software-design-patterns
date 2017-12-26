package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractLandingGear;

/**
 * Type of landing gear usually found on general aviation aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public class FixedLandingGear extends AbstractLandingGear {

    public FixedLandingGear(int numberOfWheels) {
        super (numberOfWheels, false);
    }
}
