package com.software.designpatterns.builder;

import com.software.designpatterns.base.iface.Aircraft;
import lombok.extern.slf4j.Slf4j;

/**
 * Generic builder which has methods to build all components necessary for heavy and GA aircraft.
 * Specific subclassing builders will determine which methods they want to override for their particular
 * purpose.
 *
 * @author Mudassar "Moe" Bashir
 */
@Slf4j
public abstract class AircraftBuilder {

    /**
     * Common component.
     */
    public void buildFuselage() {
        log.info("Building fuselage.");
    }

    /**
     * Component specific to GA aircraft.
     */
    public void buildPropellerBlade() {}

    /**
     * Component specific to GA aircraft.
     */
    public void buildTieDownHooks() {}

    /**
     * Component specific to heavy aircraft.
     */
    public void buildCargoArea() {}

    /**
     * Component specific to heavy aircraft.
     */
    public void buildPassengerArea() {}

    /**
     * Returns the finished vehicle.
     * @return finished {@link Aircraft}
     */
    public abstract Aircraft getAircraft();

}
