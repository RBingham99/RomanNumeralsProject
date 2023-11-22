package com.sparta.rb;

public class InvalidValueException extends Exception {

    @Override
    public String getMessage() {
        return "Entered value must be above 0 and under 4000";
    }
}
