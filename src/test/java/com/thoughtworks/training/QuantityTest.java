package com.thoughtworks.training;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.training.QuantityFactory.*;
import static com.thoughtworks.training.QuantityFactory.createFahrenheit;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity zeroFoot = createFoot(0);
        AddableQuantity anotherZeroFoot = createFoot(0);

        assertEquals(zeroFoot, anotherZeroFoot);
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity zeroFoot = createFoot(0);

        assertNotEquals(zeroFoot, new Object());
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity twoFoot = createFoot(2);

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneFoot = createFoot(1.0);
        AddableQuantity otherFoot = createFoot(1.0);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        NonAddableQuantity oneFoot = createFoot(1);
        NonAddableQuantity twoFoot = null;

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        AddableQuantity zeroInch = createInch(0);
        AddableQuantity anotherZeroInch = createInch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity zeroInch = createInch(0);

        assertNotEquals(zeroInch, new Object());
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity otherFoot = createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneInch = createInch(1);
        AddableQuantity twoInch = createInch(2);

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneInch = createInch(1);
        AddableQuantity twoInch = null;

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity oneInch = createInch(1);
        AddableQuantity oneFoot = createFoot(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroInch = createInch(0);
        AddableQuantity zeroFoot = createFoot(0);

        assertEquals(zeroFoot, zeroInch);
    }

    @Test
    void givenTwelveInchOneFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twelveInch = createInch(12);
        AddableQuantity oneFoot = createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwentyFourInchAndtwoFeet_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twentyFourInch = createInch(24);
        AddableQuantity twoFeet = createFoot(2);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twelveInch = createInch(12);
        AddableQuantity oneFoot = createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroYard = createYard(0);
        AddableQuantity anotherZeroYard = createYard(0);

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity oneYard = createYard(1);
        AddableQuantity anotherOneYard = createYard(1);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenOneYardAndThreeFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity oneYard = createYard(1);
        AddableQuantity threeFoot = createFoot(3);

        assertEquals(oneYard, threeFoot);
    }


    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity twoInch = createInch(2.0);
        AddableQuantity anotherTwoInch = createInch(2.0);


        assertEquals(createInch(4.0), (twoInch).add(anotherTwoInch));

    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity OneFeet = createFoot(1.0);
        AddableQuantity TwoInches = createInch(2.0);


        assertEquals(createInch(14.0), ((AddableQuantity) OneFeet).add(TwoInches));

    }

    @Test
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity twoInches = createInch(2.0);
        AddableQuantity oneFoot = createFoot(1.0);

        assertEquals(createInch(14.0), (oneFoot).add(twoInches));

    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldGiveTwoFoot() {
        AddableQuantity oneFoot = createFoot(1.0);
        AddableQuantity anotherFoot = createFoot(1.0);


        assertEquals(createFoot(2.0), (oneFoot).add(anotherFoot));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78 Liters
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeEqual() {
        AddableQuantity oneGallon = createGallon(1.0);
        AddableQuantity anotherOneGallon = createGallon(1.0);


        assertEquals(oneGallon, anotherOneGallon);
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeEqual() {
        AddableQuantity oneLiter = createLiter(1.0);
        AddableQuantity anotherOneLiter = createLiter(1.0);

        assertEquals(oneLiter, anotherOneLiter);
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldNotEqual() {
        AddableQuantity oneLiter = createLiter(1.0);
        AddableQuantity oneGallon = createGallon(1.0);

        assertNotEquals(oneLiter, oneGallon);
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldNotEqual() {
        AddableQuantity oneGallon = createGallon(1.0);
        AddableQuantity oneLiter = createLiter(1.0);

        assertNotEquals(oneGallon, oneLiter);
    }

    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        AddableQuantity oneGallon = createGallon(1.0);
        AddableQuantity anotherOneGallon = createGallon(1.0);


        assertEquals(createGallon(2.0), (oneGallon).add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() {
        AddableQuantity oneLiter = createLiter(1.0);
        AddableQuantity anotherOneLiter = createLiter(1.0);

        assertEquals(createLiter(2.0), (oneLiter).add(anotherOneLiter));

    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        AddableQuantity oneGallon = createGallon(1.0);
        AddableQuantity oneLiter = createLiter(1.0);

        assertEquals(createLiter(4.78), (oneGallon).add(oneLiter));
    }

    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldNotEqual() {
        AddableQuantity oneInch = createInch(1.0);
        AddableQuantity oneLiter = createLiter(1.0);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenOneLiterAndOneInch_WhenEquals_ThenShouldNotEqual() {
        AddableQuantity oneInch = createLiter(1.0);
        AddableQuantity oneLiter = createInch(1.0);

        assertNotEquals(oneLiter, oneInch);
    }

    @Test
    void givenOneFeetAndOneGallon_WhenEquals_ThenShouldNotEqual() {
        AddableQuantity oneFoot = createFoot(1.0);
        AddableQuantity oneGallon = createGallon(1.0);

        assertNotEquals(oneFoot, oneGallon);
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldNotAdd() {

        assertThrows(Exception.class, () -> {
            createFoot(1.0).add(createGallon(1.0));
        });
    }

    @Test
    void givenOneGallonAndOneFoot_WhenAdd_ThenShouldNotAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            createGallon(1).add(createFoot(1));
        }, "Gallon and Foot are not same units");

    }

    @Test
    void givenTwoFahrenheitAndOneFahrenheit_WhenCheckForEquals_ThenTheyShouldNotBeEqual() {
        NonAddableQuantity twoFahrenheit = createFahrenheit(2);
        NonAddableQuantity oneFahrenheit = createFahrenheit(1);

        assertNotEquals(twoFahrenheit, oneFahrenheit);
    }

    @Test
    void givenZeroFahrenheitAndZeroCelsius_WhenCheckForEquals_ThenTheyShouldNotBeEqual() {
        NonAddableQuantity zeroFahrenheit = createFahrenheit(0);
        NonAddableQuantity zeroCelsius = createCelsius(0);

        assertNotEquals(zeroFahrenheit, zeroCelsius);
    }

    @Test
    void giventhirtyTwoFahrenheittAndZeroCelscdcius_WhenCheckForEquals_ThenTheyShouldBeEqual() {
        NonAddableQuantity thirtyTwoFahrenheit = createFahrenheit(32);
        NonAddableQuantity zeroCelsius = createCelsius(0);

        assertEquals(zeroCelsius, thirtyTwoFahrenheit);
    }
}
