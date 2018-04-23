package com.software.designpatterns.singleton;

import com.software.designpatterns.PrintFormatter;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for {@link SerialNumberGeneratorTraditional}.
 */
public class SerialNumberGeneratorTest {

    @BeforeClass
    public static void printTestType() {
        PrintFormatter.printTitle("Singleton");
    }
    /**
     * Testing to ensure we always get the same instance.
     */
    @Test
    public void shouldAlwaysReturnSameInstance() {
        assertEquals(SerialNumberGenerator.INSTANCE,
                        SerialNumberGenerator.INSTANCE);
    }

    /**
     * Every serial number we retrieve must be equal to the last one generated,
     * incremented by a unit.
     */
    @Test
    public void serialNumbersShouldBeInSequence() {
        int firstSerial = SerialNumberGenerator.INSTANCE.getNextSerial();
        int secondSerial  = SerialNumberGenerator.INSTANCE.getNextSerial();
        assertEquals(firstSerial + 1, secondSerial);
        assertEquals(secondSerial + 1,
                SerialNumberGenerator.INSTANCE.getNextSerial());
    }


}