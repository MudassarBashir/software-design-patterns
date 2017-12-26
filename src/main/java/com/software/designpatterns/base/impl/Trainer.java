package com.software.designpatterns.base.impl;

import com.software.designpatterns.base.abstraction.AbstractGaAircraft;
import com.software.designpatterns.base.iface.LandingGear;

/**
 * A small single engine general aviation aircraft used for flight training.
 *
 * @author Mudassar "Moe" Bashir
 */
public class Trainer extends AbstractGaAircraft {

    public Trainer(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public Trainer(LandingGear landingGear, Livery livery) {
        super(landingGear, Livery.NO_LIVERY);
    }
}
