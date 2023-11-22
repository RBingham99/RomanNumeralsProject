package com.sparta.rb;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
    @DisplayName("Check 4 returns IV")
    public void check4ReturnsIV() throws InvalidValueException {
        Assertions.assertEquals("IV", App.convertToRomanNumerals(4));
    }

    @Test
    @DisplayName("Check 9 returns IX")
    public void check9ReturnsIX() throws InvalidValueException {
        Assertions.assertEquals("IX", App.convertToRomanNumerals(9));
    }

    @Test
    @DisplayName("Check 29 returns XXIX")
    public void check29ReturnsXXIX() throws InvalidValueException {
        Assertions.assertEquals("XXIX", App.convertToRomanNumerals(29));
    }

    @Test
    @DisplayName("Check 80 returns LXXX")
    public void check80ReturnsLXXX() throws InvalidValueException {
        Assertions.assertEquals("LXXX", App.convertToRomanNumerals(80));
    }

    @Test
    @DisplayName("Check 294 returns CCXCIV")
    public void check294ReturnsCCXCIV() throws InvalidValueException {
        Assertions.assertEquals("CCXCIV", App.convertToRomanNumerals(294));
    }

    @Test
    @DisplayName("Check 2019 returns MMXIX")
    public void check2019ReturnsMMXIX() throws InvalidValueException {
        Assertions.assertEquals("MMXIX", App.convertToRomanNumerals(2019));
    }

    @Test
    @DisplayName("Check 4000 throws InvalidValueException")
    public void check4000ThrowsInvalidValueException() {
        Exception thrown = Assertions.assertThrows(InvalidValueException.class, () -> {
            App.convertToRomanNumerals(4000);
        });

        Assertions.assertEquals("Entered value must be above 0 and under 4000", thrown.getMessage());
    }

}
