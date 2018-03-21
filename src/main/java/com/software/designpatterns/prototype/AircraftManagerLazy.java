package com.software.designpatterns.prototype;

import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.*;

/**
 * A more efficient manager which lazily instantiates objects as they are needed instead of potentially unnecessarily
 * instantiating all the different types before they are actually needed.
 */
public class AircraftManagerLazy {

    private static final int NUM_WHEELS_SMALL_AIRCRAFT = 3;
    private static final int NUM_WHEELS_LARGE_AIRCRAFT = 10;

    private Aircraft single, twin, trainer, passenger, cargo;

    public AircraftManagerLazy() {}

    public Aircraft createSingle() {
        if (null == single) {
            single = new Single(new FixedLandingGear(NUM_WHEELS_SMALL_AIRCRAFT));
            return single;
        }
        return (Aircraft) single.clone();
    }

    public Aircraft createTwin() {
        if (null == twin) {
            twin = new Twin(new FixedLandingGear(NUM_WHEELS_SMALL_AIRCRAFT));
            return twin;
        }
        return (Aircraft) twin.clone();
    }

    public Aircraft createTrainer() {
        if (null == trainer) {
            trainer = new Trainer(new FixedLandingGear(NUM_WHEELS_SMALL_AIRCRAFT));
            return trainer;
        }
        return (Aircraft) trainer.clone();
    }

    public Aircraft createPassenger() {
        if (null == passenger) {
            passenger = new Passenger(new RetractableLandingGear(NUM_WHEELS_LARGE_AIRCRAFT));
            return passenger;
        }
        return (Aircraft) passenger.clone();
    }

    public Aircraft createCargo() {
        if (null == cargo) {
            cargo = new Cargo(new RetractableLandingGear(NUM_WHEELS_LARGE_AIRCRAFT));
            return cargo;
        }
        return (Aircraft) cargo.clone();
    }
}
