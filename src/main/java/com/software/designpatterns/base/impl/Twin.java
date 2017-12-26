package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractGaAircraft;
import com.software.designpatterns.base.iface.LandingGear;

/**
 * A twin engine general aviation aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public class Twin extends AbstractGaAircraft {

    public Twin(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public Twin(LandingGear landingGear, Livery livery) {
        super(landingGear, Livery.NO_LIVERY);
    }
}
