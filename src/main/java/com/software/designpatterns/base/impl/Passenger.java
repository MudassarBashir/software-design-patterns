package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractHeavyAircraft;
import com.software.designpatterns.base.iface.LandingGear;

/**
 * Heavy passenger aircraft like an airliner.
 *
 * @author Mudassar "Moe" Bashir
 */
public class Passenger extends AbstractHeavyAircraft {

    public Passenger(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public Passenger(LandingGear landingGear, Livery livery) {
        super(landingGear, Livery.NO_LIVERY);
    }
}
