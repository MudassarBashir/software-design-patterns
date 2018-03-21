package com.software.designpatterns;

import lombok.extern.slf4j.Slf4j;

/**
 * A utility class for printing informational text.
 */
@Slf4j
public class PrintFormatter {

    public static void printTitle(String s) {
        log.info("----- " + s + " -----");
    }
}
