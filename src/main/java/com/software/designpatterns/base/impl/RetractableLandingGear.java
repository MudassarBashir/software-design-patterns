package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractLandingGear;

/**
 * Landing gear that is retractable, usually found on heavy aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public class RetractableLandingGear extends AbstractLandingGear {

    public RetractableLandingGear(int numberOfWheels) {
        super (numberOfWheels, true);
    }
}
