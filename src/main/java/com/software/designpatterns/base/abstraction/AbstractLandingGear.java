package com.software.designpatterns.base.abstraction;

import com.software.designpatterns.base.iface.LandingGear;

/**
 * Represents the abstract concept an aircraft's landing gear.
 *
 * @author Mudassar "Moe" Bashir
 */
public abstract class AbstractLandingGear implements LandingGear {

    private int numberOfWheels;
    private boolean retractable;

    public AbstractLandingGear(int numberOfWheels, boolean retractable) {

        this.numberOfWheels = numberOfWheels;
        this.retractable = retractable;
    }

    /**
     * Returns the number of wheels in the landing gear across all struts.
     * @return
     */
    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public boolean isRetractable() {
        return retractable;
    }

    @Override public String toString() {
        return getClass().getSimpleName() +
                " (wheels: " + getNumberOfWheels() + ", " + "retractable: " + isRetractable() + ")";
    }
}
