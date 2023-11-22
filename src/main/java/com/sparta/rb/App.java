package com.sparta.rb;

public class App
{
    public static void main( String[] args )
    {
        try {
            System.out.println(convertToRomanNumerals(5000));
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String convertToRomanNumerals(int numToConvert) throws InvalidValueException {
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder answerString = new StringBuilder();

        if (numToConvert < 4000 && numToConvert > 0) {
            for (int i = 0; i <= values.length - 1; i++) {
                numToConvert = getNumeralString(numToConvert, values, i, answerString, numerals);
            }
            return answerString.toString();
        } else {
            throw new InvalidValueException();
        }
    }

    private static int getNumeralString(int numToConvert, int[] values, int i, StringBuilder answerString, String[] numerals) {
        while (numToConvert >= values[i]) {
            answerString.append(numerals[i]);
            numToConvert = numToConvert - values[i];
        }
        return numToConvert;
    }
}
