package com.software.designpatterns.factorymethod;

import com.software.designpatterns.PrintFormatter;
import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.Cargo;
import com.software.designpatterns.base.impl.Trainer;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The factory method design pattern's purpose is to define an interface for creating objects but
 * it's subclasses decide which class to instantiate.
 */
@Slf4j
public class FactoryMethodTest {

    @BeforeClass
    public static void printTestType() {
        PrintFormatter.printTitle("Factory Method");
    }

    /**
     * If we want a single purpose aircraft in the Atlantic livery.
     */
    @Test
    public void singlePurposeAtlanticLiveryAircraftCreationTest() {

        AircraftFactory aircraftFactory = new GaFactory();
        Aircraft aircraft = aircraftFactory.build(AircraftFactory.FlyingStyle.SINGLE_PURPOSE, Aircraft.Livery.AIR_ATLANTIC);
        log.info(aircraft.toString());
        assert(aircraft instanceof Trainer);
        assert(aircraft.getLivery().equals(Aircraft.Livery.AIR_ATLANTIC));
    }

    /**
     * If we want a single purpose aircraft in the Atlantic livery.
     */
    @Test
    public void multiPurposeHeavyPacificLiveryAircraftCreationTest() {

        AircraftFactory aircraftFactory = new HeavyFactory();
        Aircraft aircraft = aircraftFactory.build(AircraftFactory.FlyingStyle.CUSTOM_PURPOSE, Aircraft.Livery.PACIFIC_AIRWAYS);
        log.info(aircraft.toString());
        assert(aircraft instanceof Cargo);
        assert(aircraft.getLivery().equals(Aircraft.Livery.PACIFIC_AIRWAYS));
    }
}
