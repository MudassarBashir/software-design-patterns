package com.software.designpatterns.factorymethod;

import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.Cargo;
import com.software.designpatterns.base.impl.Passenger;
import com.software.designpatterns.base.impl.RetractableLandingGear;

/**
 * Heavy factory to create heavy aircraft.
 */
public class HeavyFactory extends AircraftFactory {

    @Override
    protected Aircraft selectAircraft(FlyingStyle style) {

        if ((style == FlyingStyle.MULTI_PURPOSE) ||
            (style == FlyingStyle.CUSTOM_PURPOSE)) {
            return new Cargo(new RetractableLandingGear(10));
        }
        else {
            return new Passenger(new RetractableLandingGear(10));
        }
    }
}
