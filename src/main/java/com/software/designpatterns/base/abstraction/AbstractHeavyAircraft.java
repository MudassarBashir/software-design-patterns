package com.software.designpatterns.base.abstraction;

import com.software.designpatterns.base.iface.LandingGear;

/**
 * Represents the abstract concept of a heavy Aircraft. For example, an airliner or a heavy cargo lifter.
 *
 * @author Mudassar "Moe" Bashir
 */
public abstract class AbstractHeavyAircraft extends AbstractAircraft {

    public AbstractHeavyAircraft(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public AbstractHeavyAircraft(LandingGear landingGear, Livery livery) {
        super(landingGear, livery);
    }
}
