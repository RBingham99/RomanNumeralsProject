package com.sparta.rb;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
    @DisplayName("Check 4 returns IV")
    public void check4ReturnsIV() {
        Assertions.assertEquals("IV", App.convertToRomanNumerals(4));
    }

    @Test
    @DisplayName("Check 9 returns IX")
    public void check9ReturnsIX() {
        Assertions.assertEquals("IX", App.convertToRomanNumerals(9));
    }

    @Test
    @DisplayName("Check 29 returns XXIX")
    public void check29ReturnsXXIX() {
        Assertions.assertEquals("XXIX", App.convertToRomanNumerals(29));
    }

    @Test
    @DisplayName("Check 80 returns LXXX")
    public void check80ReturnsLXXX() {
        Assertions.assertEquals("LXXX", App.convertToRomanNumerals(80));
    }

    @Test
    @DisplayName("Check 294 returns CCXCIV")
    public void check294ReturnsCCXCIV() {
        Assertions.assertEquals("CCXCIV", App.convertToRomanNumerals(294));
    }

    @Test
    @DisplayName("Check 2019 returns MMXIX")
    public void check2019ReturnsMMXIX() {
        Assertions.assertEquals("MMXIX", App.convertToRomanNumerals(2019));
    }

    @Test
    @DisplayName("Check 3000 returns MMM")
    public void check3000ReturnsMMM() {
        Assertions.assertEquals("MMM", App.convertToRomanNumerals(3000));
    }

    @Test
    @DisplayName("Check 10000 returns MMMMMMMMMM")
    public void check10000ReturnsMMMMMMMMMM() {
        Assertions.assertEquals("MMMMMMMMMM", App.convertToRomanNumerals(10000));
    }
}
