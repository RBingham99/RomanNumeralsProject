package com.sparta.rb;

import java.util.ArrayList;
import java.util.HashMap;

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

        for (int i = 0; i <= values.length - 1; i++) {
            while (numToConvert >= values[i]) {
                answerString.append(numerals[i]);
                numToConvert = numToConvert - values[i];
            }
        }
        return answerString.toString();
    }
}
