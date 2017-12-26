package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractGaAircraft;
import com.software.designpatterns.base.iface.LandingGear;

/**
 * A light general aviation aircraft. Single engine.
 *
 * @author Mudassar "Moe" Bashir
 */
public class Single extends AbstractGaAircraft {

    public Single(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public Single(LandingGear landingGear, Livery livery) {
        super(landingGear, Livery.NO_LIVERY);
    }
}
