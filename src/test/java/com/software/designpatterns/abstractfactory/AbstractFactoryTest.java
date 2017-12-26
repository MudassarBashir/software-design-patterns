package com.software.designpatterns.abstractfactory;

import com.software.designpatterns.PrintFormatter;
import com.software.designpatterns.abstractfactory.iface.Fuselage;
import com.software.designpatterns.abstractfactory.iface.Window;
import com.software.designpatterns.abstractfactory.iface.Wing;
import com.software.designpatterns.abstractfactory.impl.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests for the abstract factory design pattern.
 *
 * The advantage of this design patterns is that
 * each factory provides the same set of methods (the same interface). A client just needs to know which factory to
 * instantiate based on what family of parts are needed and thence an identical set of method calls is invoked regardless
 * of which factory is used, to get the actual parts.
 */
public class AbstractFactoryTest {

    @BeforeClass
    public static void printTestType() {
        PrintFormatter.printTitle("Abstract Factory");
    }

    /**
     * A factory that creates parts for general aviation aircraft should provide general aviation related components.
     */
    @Test
    public void gaFactoryShouldProduceGaParts() {
        AbstractAircraftFactory factory = new GaFactory();
        Fuselage fuselage = factory.createFuselage();
        Window window = factory.createWindow();
        Wing wing = factory.createWing();

        assertTrue(fuselage instanceof GaFuselage);
        assertTrue(window instanceof GaWindow);
        assertTrue(wing instanceof GaWing);

    }

    /**
     * In contrast, a factory that creates parts for heavy aircraft should provide heavy aircraft components.
     */
    @Test
    public void heavyFactoryShouldProduceHeavyParts() {
        AbstractAircraftFactory factory = new HeavyFactory();
        Fuselage fuselage = factory.createFuselage();
        Window window = factory.createWindow();
        Wing wing = factory.createWing();

        assertTrue(fuselage instanceof HeavyFuselage);
        assertTrue(window instanceof HeavyWindow);
        assertTrue(wing instanceof HeavyWing);

    }
}


