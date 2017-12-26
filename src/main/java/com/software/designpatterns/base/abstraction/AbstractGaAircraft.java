package com.software.designpatterns.base.abstraction;

import com.software.designpatterns.base.iface.LandingGear;

/**
 * Represents the abstract concept a of general aviation Aircraft. This is often a small single or twin engine
 * piston aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public abstract class AbstractGaAircraft extends AbstractAircraft {

    public AbstractGaAircraft(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public AbstractGaAircraft(LandingGear landingGear, Livery livery) {
        super(landingGear, livery);
    }


}
