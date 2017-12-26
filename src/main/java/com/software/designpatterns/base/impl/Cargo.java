package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractHeavyAircraft;
import com.software.designpatterns.base.iface.LandingGear;

/**
 * Heavy cargo aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public class Cargo extends AbstractHeavyAircraft {

    public Cargo(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public Cargo(LandingGear landingGear, Livery livery) {
        super(landingGear, Livery.NO_LIVERY);
    }
}
