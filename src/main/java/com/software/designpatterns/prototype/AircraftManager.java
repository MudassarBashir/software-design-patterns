package com.software.designpatterns.prototype;

import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.*;

public class AircraftManager {

    private static final int NUM_WHEELS_SMALL_AIRCRAFT = 3;
    private static final int NUM_WHEELS_LARGE_AIRCRAFT = 10;

    private Aircraft single, twin, trainer, passenger, cargo;

    public AircraftManager() {
        single = new Single(new FixedLandingGear(NUM_WHEELS_SMALL_AIRCRAFT));
        twin = new Twin(new FixedLandingGear(NUM_WHEELS_SMALL_AIRCRAFT));
        trainer = new Trainer(new FixedLandingGear(NUM_WHEELS_SMALL_AIRCRAFT));
        passenger = new Passenger(new RetractableLandingGear(NUM_WHEELS_LARGE_AIRCRAFT));
        cargo = new Cargo(new RetractableLandingGear(NUM_WHEELS_LARGE_AIRCRAFT));
    }

    public Aircraft createSingle() {
        return (Aircraft) single.clone();
    }

    public Aircraft createTwin() {
        return (Aircraft) twin.clone();
    }

    public Aircraft createTrainer() {
        return (Aircraft) trainer.clone();
    }

    public Aircraft createPassenger() {
        return (Aircraft) passenger.clone();
    }

    public Aircraft createCargo() {
        return (Aircraft) cargo.clone();
    }
}
