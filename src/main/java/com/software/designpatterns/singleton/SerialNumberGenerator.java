package com.software.designpatterns.singleton;

/**
 * Using an Enum as opposed to the traditional approach, can simplify things. We don't need to
 * define any static members or worry about a constructor.
 */
public enum SerialNumberGenerator {
    INSTANCE;

    private int count;

    public synchronized int getNextSerial() {
        return ++count;
    }
}
