package com.software.designpatterns.base.iface;

/**
 * Represents aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public interface Aircraft extends Cloneable {

    /**
     * Paint scheme.
     */
    enum Livery {
        NO_LIVERY,
        AIR_ATLANTIC,
        PACIFIC_AIRWAYS
    }

    LandingGear getLandingGear();
    Aircraft.Livery getLivery();

    /**
     * 'Paints' the aircraft by setting its livery.
     * @param livery the livery or paint scheme to paint the aircraft with
     */
    void color(Aircraft.Livery livery);

    Object clone();

}
