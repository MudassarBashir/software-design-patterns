package com.software.designpatterns.singleton;

/**
 * A singleton to generate unique serial numbers for aircraft
 * (traditional approach to using a singleton).
 */
public class SerialNumberGeneratorTraditional {

    // static members
    private static SerialNumberGeneratorTraditional instance;

    public synchronized static SerialNumberGeneratorTraditional getInstance() {
        if (null == instance) {
            instance = new SerialNumberGeneratorTraditional();
        }
        return instance;
    }

    // instance variables
    private int count;

    // private constructor
    private SerialNumberGeneratorTraditional() {}

    // instance methods
    public synchronized int getNextSerial() {
        return ++count;
    }
}
