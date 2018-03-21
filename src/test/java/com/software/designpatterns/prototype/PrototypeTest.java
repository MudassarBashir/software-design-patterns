package com.software.designpatterns.prototype;

import com.software.designpatterns.PrintFormatter;
import com.software.designpatterns.base.iface.Aircraft;
import com.software.designpatterns.base.impl.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The prototype design pattern can help cloning objects which are otherwise time consuming to instantiate from scratch.
 */
@Slf4j
public class PrototypeTest {

    @BeforeClass
    public static void printTestType() {
        PrintFormatter.printTitle("Prototype");
    }

    /**
     * Manager should return correct objects.
     */
    @Test
    public void aircraftManagerShouldBeAbleToCloneObjects() {
        log.info("Testing AircraftManager.");
        AircraftManager manager = new AircraftManager();
        Aircraft single = manager.createSingle();
        assert(single != null && single instanceof Single);
        Aircraft twin = manager.createTwin();
        assert(twin != null && twin instanceof Twin);
        Aircraft trainer = manager.createTrainer();
        assert(trainer != null && trainer instanceof Trainer);
        Aircraft passenger = manager.createPassenger();
        assert(passenger != null && passenger instanceof Passenger);
        Aircraft cargo = manager.createCargo();
        assert(cargo != null && cargo instanceof Cargo);
    }

    /**
     * Lazy manager should return correct objects.
     */
    @Test
    public void aircraftManagerLazyShouldBeAbleToCloneObjects() {
        log.info("Testing AircraftManagerLazy.");
        AircraftManagerLazy manager = new AircraftManagerLazy();
        Aircraft single = manager.createSingle();
        assert(single != null && single instanceof Single);
        Aircraft twin = manager.createTwin();
        assert(twin != null && twin instanceof Twin);
        Aircraft trainer = manager.createTrainer();
        assert(trainer != null && trainer instanceof Trainer);
        Aircraft passenger = manager.createPassenger();
        assert(passenger != null && passenger instanceof Passenger);
        Aircraft cargo = manager.createCargo();
        assert(cargo != null && cargo instanceof Cargo);
    }
}
