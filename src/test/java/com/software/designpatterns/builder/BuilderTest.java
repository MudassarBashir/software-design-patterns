package com.software.designpatterns.builder;

import com.software.designpatterns.PrintFormatter;
import com.software.designpatterns.base.abstraction.AbstractGaAircraft;
import com.software.designpatterns.base.abstraction.AbstractHeavyAircraft;
import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.FixedLandingGear;
import com.software.designpatterns.base.impl.Passenger;
import com.software.designpatterns.base.impl.RetractableLandingGear;
import com.software.designpatterns.base.impl.Single;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for the builder design pattern.
 *
 * The builder pattern separates the construction of a complex object from it's representation so that the same
 * construction process can create different representations. In other words, the same generic builder (our AircraftBuilder)
 * can be used to make general aviation aircraft (GA aircraft) or heavy aircraft, depending on what director object
 * direct's it's 'building process'.
 */
@Slf4j
public class BuilderTest {

    @BeforeClass
    public static void printTestType() {
        PrintFormatter.printTitle("Builder");
    }

    /**
     * A GA builder and director combination should create a GA aircraft.
     */
    @Test
    public void gaBuilderAndDirectorShouldProduceGaAircraft() {
        AbstractGaAircraft gaAircraft = new Single(new FixedLandingGear(3));
        AircraftBuilder builder = new GaBuilder(gaAircraft);
        AircraftDirector director = new GaDirector();
        Aircraft aircraft = director.build(builder);
        log.info(aircraft.toString());
        assert(aircraft instanceof AbstractGaAircraft);
    }

    /**
     * Similarly, a heavy builder and director combination should create a heavy aircraft.
     */
    @Test
    public void heavyBuilderAndDirectorShouldProduceHeavyAircraft() {
        AbstractHeavyAircraft heavyAircraft = new Passenger(new RetractableLandingGear(10));
        AircraftBuilder builder = new HeavyBuilder(heavyAircraft);
        AircraftDirector director = new HeavyDirector();
        Aircraft aircraft = director.build(builder);
        log.info(aircraft.toString());
        assert(aircraft instanceof AbstractHeavyAircraft);
    }
}
