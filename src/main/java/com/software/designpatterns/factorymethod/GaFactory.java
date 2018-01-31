package com.software.designpatterns.factorymethod;

import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.FixedLandingGear;
import com.software.designpatterns.base.impl.Single;
import com.software.designpatterns.base.impl.Trainer;
import com.software.designpatterns.base.impl.Twin;

/**
 * Concrete factory to create general aviation (GA) aircraft.
 */
public class GaFactory extends AircraftFactory {

    @Override
    protected Aircraft selectAircraft(FlyingStyle style) {

        if (style == FlyingStyle.SINGLE_PURPOSE) {
            return new Trainer(new FixedLandingGear(3));
        } else if (style == FlyingStyle.MULTI_PURPOSE) {
            return new Single(new FixedLandingGear(3));
        } else {
            return new Twin(new FixedLandingGear(5));
        }
    }
}
