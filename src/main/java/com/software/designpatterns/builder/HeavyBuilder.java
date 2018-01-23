package com.software.designpatterns.builder;

import com.software.designpatterns.base.abstraction.AbstractHeavyAircraft;
import com.software.designpatterns.base.iface.Aircraft;
import lombok.extern.slf4j.Slf4j;

/**
 * Heavy builder overrides only the methods necessary in it's superclass which are needed to build parts for heavy
 * aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
@Slf4j
public class HeavyBuilder extends AircraftBuilder {


    private AbstractHeavyAircraft aircraftInProgress;

    public HeavyBuilder(AbstractHeavyAircraft aircraft) {
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
    public void buildCargoArea() {
        log.info("Building cargo area");
    }

    @Override
    public void buildPassengerArea() {
        log.info("Building passenger area");
    }
}
