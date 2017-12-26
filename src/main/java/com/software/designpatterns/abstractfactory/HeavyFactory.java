package com.software.designpatterns.abstractfactory;

import com.software.designpatterns.abstractfactory.impl.HeavyFuselage;
import com.software.designpatterns.abstractfactory.impl.HeavyWindow;
import com.software.designpatterns.abstractfactory.impl.HeavyWing;

/**
 * A factory to create parts for heavy aircraft.
 *
 * @author Mudassar "Moe" Bashir
 */
public class HeavyFactory extends AbstractAircraftFactory {

    @Override
    public HeavyFuselage createFuselage() {
        return new HeavyFuselage();
    }

    @Override
    public HeavyWindow createWindow() {
        return new HeavyWindow();
    }

    @Override
    public HeavyWing createWing() {
        return new HeavyWing();
    }

}
