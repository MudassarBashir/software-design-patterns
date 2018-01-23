package com.software.designpatterns.builder;

import com.software.designpatterns.base.iface.Aircraft;

/**
 * Director object to direct a {@link GaBuilder}.
 */
public class GaDirector extends AircraftDirector {

    @Override
    public Aircraft build(AircraftBuilder builder) {
        builder.buildFuselage();
        builder.buildPropellerBlade();
        builder.buildTieDownHooks();
        return builder.getAircraft();
    }
}
