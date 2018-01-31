package com.software.designpatterns.factorymethod;

import com.software.designpatterns.base.iface.Aircraft;

/**
 * A generic factory to create aircraft.
 */
public abstract class AircraftFactory {

    public enum FlyingStyle { SINGLE_PURPOSE, MULTI_PURPOSE, CUSTOM_PURPOSE}

    public Aircraft build(FlyingStyle style, Aircraft.Livery livery) {

        Aircraft aircraft = selectAircraft(style);
        aircraft.color(livery);
        return aircraft;
    }

    // The factory method, after which this design pattern is named
    protected abstract Aircraft selectAircraft(FlyingStyle style);
}
