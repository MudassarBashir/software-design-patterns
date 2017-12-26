package com.software.designpatterns.abstractfactory;

import com.software.designpatterns.abstractfactory.iface.Fuselage;
import com.software.designpatterns.abstractfactory.iface.Window;
import com.software.designpatterns.abstractfactory.iface.Wing;

/**
 * A factory object to create aircraft components.
 *
 * @author Mudassar "Moe" Bashir
 */
public abstract class AbstractAircraftFactory {

    /**
     * Creates the fuselage for an aircraft.
     * @return the fuselage of an aircraft.
     */
    public abstract Fuselage createFuselage();

    /**
     * Creates the window(s) for an aircraft.
     * @return the window(s) for an aircraft.
     */
    public abstract Window createWindow();
    public abstract Wing createWing();
}
