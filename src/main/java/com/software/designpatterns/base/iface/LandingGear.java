package com.software.designpatterns.base.iface;

/**
 * Represents the landing gear of an {@link Aircraft} as a separate abstract entity.
 *
 * @author Mudassar "Moe" Bashir
 */
public interface LandingGear {

    int getNumberOfWheels();

    /**
     * Tells whether the landing gear on the aircraft is retractable.
     * @return whether the landing gear is retractable
     */
    boolean isRetractable();
}
