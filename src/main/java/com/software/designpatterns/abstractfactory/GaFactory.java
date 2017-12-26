package com.software.designpatterns.abstractfactory;

import com.software.designpatterns.abstractfactory.impl.GaFuselage;
import com.software.designpatterns.abstractfactory.impl.GaWindow;
import com.software.designpatterns.abstractfactory.impl.GaWing;

/**
 * A factory to create parts for general aviation aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public class GaFactory extends AbstractAircraftFactory {

    @Override
    public GaFuselage createFuselage() {
        return new GaFuselage();
    }

    @Override
    public GaWindow createWindow() {
        return new GaWindow();
    }

    @Override
    public GaWing createWing() {
        return new GaWing();
    }

}
