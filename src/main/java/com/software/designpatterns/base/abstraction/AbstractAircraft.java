package com.software.designpatterns.base.abstraction;

import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.iface.LandingGear;

/**
 * Represents the abstract concept of an Aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public abstract class AbstractAircraft implements Aircraft {

    private LandingGear landingGear;
    private Aircraft.Livery livery;

    public AbstractAircraft(LandingGear landingGear) {
        this(landingGear, Livery.NO_LIVERY);
    }

    public AbstractAircraft(LandingGear landingGear, Aircraft.Livery livery) {
        this.landingGear = landingGear;
        this.livery = livery;
    }

    /**
     * Returns the landing gear.
     * @return
     */
    @Override
    public LandingGear getLandingGear() {
        return landingGear;
    }

    /**
     * Returns the livery.
     * @return
     */
    @Override
    public Livery getLivery() {
        return livery;
    }

    @Override
    public void color(Livery livery) {
        this.livery = livery;
    }

    @Override public String toString() {
        return getClass().getSimpleName() +
                " (" + landingGear + ", " + livery + ")";
    }
}
