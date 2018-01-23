package com.software.designpatterns.builder;

import com.software.designpatterns.base.iface.Aircraft;

/**
 * The director requires a builder to build.
 *
 * @author Mudassar "Moe" Bashir
 */
public abstract class AircraftDirector {

    public abstract Aircraft build(AircraftBuilder builder);
}
