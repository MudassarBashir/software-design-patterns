package com.software.designpatterns.factorymethod;

import com.software.designpatterns.base.iface.Aircraft;

/**
 * A generic factory to create aircraft.
 */
public abstract class AircraftFactory {

    public enum Category { GA, HEAVY }

    public enum FlyingStyle { SINGLE_PURPOSE, MULTI_PURPOSE, CUSTOM_PURPOSE}

    public static Aircraft make(Category category, FlyingStyle flyingStyle, Aircraft.Livery livery) {

        AircraftFactory aircraftFactory = null;

        if (category == Category.GA) {
            aircraftFactory = new GaFactory();
        }
        else {
            aircraftFactory = new HeavyFactory();
        }

        return aircraftFactory.build(flyingStyle, livery);
    }

    public Aircraft build(FlyingStyle style, Aircraft.Livery livery) {

        Aircraft aircraft = selectAircraft(style);
        aircraft.color(livery);
        return aircraft;
    }

    // The factory method, after which this design pattern is named
    protected abstract Aircraft selectAircraft(FlyingStyle style);
}
