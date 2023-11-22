package com.sparta.rb.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    public static void setUpLogger(Logger logger) {
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        ConsoleHandler.setUpConsoleHandler(logger);
    }
}
