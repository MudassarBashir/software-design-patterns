package com.software.designpatterns.singleton;

import com.software.designpatterns.PrintFormatter;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for {@link SerialNumberGeneratorTraditional}.
 */
public class SerialNumberGeneratorTraditionalTest {

    @BeforeClass
    public static void printTestType() {
        PrintFormatter.printTitle("Singleton Traditional");
    }
    /**
     * We should always get the same instance when we call getInstance().
     */
    @Test
    public void shouldAlwaysReturnSameInstance() {
        assertEquals(SerialNumberGeneratorTraditional.getInstance(),
                    SerialNumberGeneratorTraditional.getInstance());
    }

    /**
     * Every serial number we retrieve must be equal to the last one generated,
     * incremented by a unit.
     */
    @Test
    public void serialNumbersShouldBeInSequence() {
        int firstNumber = SerialNumberGeneratorTraditional.getInstance().getNextSerial();
        int secondNumber  = SerialNumberGeneratorTraditional.getInstance().getNextSerial();
        assertEquals(firstNumber + 1, secondNumber);
        assertEquals(secondNumber + 1,
                        SerialNumberGeneratorTraditional.getInstance().getNextSerial());
    }
}