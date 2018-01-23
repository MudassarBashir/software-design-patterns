package com.software.designpatterns.builder;

import com.software.designpatterns.base.abstraction.AbstractGaAircraft;
import com.software.designpatterns.base.iface.Aircraft;
import lombok.extern.slf4j.Slf4j;

/**
 * GA builder overrides only the methods necessary in it's superclass which are needed to build parts for GA
 * aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
@Slf4j
public class GaBuilder extends AircraftBuilder {

    private AbstractGaAircraft aircraftInProgress;

    public GaBuilder(AbstractGaAircraft aircraft) {
        this.aircraftInProgress = aircraft;
    }

    @Override
    public Aircraft getAircraft() {
        return this.aircraftInProgress;
    }

    @Override
    public void buildFuselage() {
        super.buildFuselage();
    }

    @Override
    public void buildPropellerBlade() {
        log.info("Building propeller blade.");
    }

    @Override
    public void buildTieDownHooks() {
        log.info("Building tie down hooks.");
    }
}
