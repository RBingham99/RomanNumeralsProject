package com.sparta.rb;

import com.sparta.rb.logging.MyLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    public static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        MyLogger.setUpLogger(logger);

        try {
            System.out.println(convertToRomanNumerals(97));
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String convertToRomanNumerals(int numToConvert) throws InvalidValueException {

        logger.log(Level.INFO, "Entered convertToRomanNumerals method");

        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder answerString = new StringBuilder();

        if (numToConvert < 4000 && numToConvert > 0) {

            logger.log(Level.INFO, "Entered if statement confirming input value is between 0 and 4000");

            for (int i = 0; i <= values.length - 1; i++) {
                numToConvert = getNumeralString(numToConvert, values, i, answerString, numerals);
            }
            return answerString.toString();
        } else {
            logger.log(Level.WARNING, "Invalid value exception thrown");
            throw new InvalidValueException();
        }
    }

    private static int getNumeralString(int numToConvert, int[] values, int i, StringBuilder answerString, String[] numerals) {

        logger.log(Level.INFO, "Entered getNumeralString method for time number " + (i + 1));

        while (numToConvert >= values[i]) {
            answerString.append(numerals[i]);
            numToConvert = numToConvert - values[i];
        }
        return numToConvert;
    }
}
