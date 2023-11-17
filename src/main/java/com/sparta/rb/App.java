package com.sparta.rb;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(convertToRomanNumerals(24));
    }

    public static String convertToRomanNumerals(int numToConvert)
    {
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder answerString = new StringBuilder();

        //Add some validation (num between 1 and 3999)
        //Add exception try catch

        for (int i = 0; i <= values.length - 1; i++) {
            numToConvert = getNumeralString(numToConvert, values, i, answerString, numerals);
        }
        return answerString.toString();
    }

    private static int getNumeralString(int numToConvert, int[] values, int i, StringBuilder answerString, String[] numerals) {
        while (numToConvert >= values[i]) {
            answerString.append(numerals[i]);
            numToConvert = numToConvert - values[i];
        }
        return numToConvert;
    }
}
