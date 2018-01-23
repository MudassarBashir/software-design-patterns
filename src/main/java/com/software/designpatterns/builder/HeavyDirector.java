package com.software.designpatterns.builder;

import com.software.designpatterns.base.iface.Aircraft;

/**
 * Director object to direct a {@link HeavyBuilder}.
 */
public class HeavyDirector extends AircraftDirector {

    @Override
    public Aircraft build(AircraftBuilder builder) {
        builder.buildFuselage();
        builder.buildCargoArea();
        builder.buildPassengerArea();
        return builder.getAircraft();
    }

}
