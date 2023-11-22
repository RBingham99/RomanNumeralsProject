package com.sparta.rb.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandler {
    public static void setUpConsoleHandler(Logger logger) {
        java.util.logging.ConsoleHandler consoleHandler = new java.util.logging.ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());
        logger.addHandler(consoleHandler);
    }
}
