package com.software.designpatterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for {@link SerialNumberGeneratorTraditional}.
 */
public class SerialNumberGeneratorTraditionalTest {

    /**
     * We should always get the same instance when we call getInstance().
     */
    @Test
    public void shouldAlwaysReturnSameInstance() {
        assertEquals(SerialNumberGeneratorTraditional.getInstance(),
                    SerialNumberGeneratorTraditional.getInstance());
    }

    /**
     * Every serial number we retrieve must be the last one incremented by a unit.
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