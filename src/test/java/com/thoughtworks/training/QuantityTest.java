package com.thoughtworks.training;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.training.QuantityFactory.createCelsius;
import static com.thoughtworks.training.QuantityFactory.createFahrenheit;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = QuantityFactory.createFoot(0);
        Quantity anotherZeroFoot = QuantityFactory.createFoot(0);

        assertEquals(zeroFoot, anotherZeroFoot);
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = QuantityFactory.createFoot(0);

        assertNotEquals(zeroFoot, new Object());
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1);
        Quantity twoFoot = QuantityFactory.createFoot(2);

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1.0);
        Quantity otherFoot = QuantityFactory.createFoot(1.0);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1);
        Quantity twoFoot = null;

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = QuantityFactory.createInch(0);
        Quantity anotherZeroInch = QuantityFactory.createInch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = QuantityFactory.createInch(0);

        assertNotEquals(zeroInch, new Object());
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1);
        Quantity otherFoot = QuantityFactory.createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = QuantityFactory.createInch(1);
        Quantity twoInch = QuantityFactory.createInch(2);

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = QuantityFactory.createInch(1);
        Quantity twoInch = null;

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = QuantityFactory.createInch(1);
        Quantity oneFoot = QuantityFactory.createFoot(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = QuantityFactory.createInch(0);
        Quantity zeroFoot = QuantityFactory.createFoot(0);

        assertEquals(zeroFoot, zeroInch);
    }

    @Test
    void givenTwelveInchOneFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = QuantityFactory.createInch(12);
        Quantity oneFoot = QuantityFactory.createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwentyFourInchAndtwoFeet_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = QuantityFactory.createInch(24);
        Quantity twoFeet = QuantityFactory.createFoot(2);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = QuantityFactory.createInch(12);
        Quantity oneFoot = QuantityFactory.createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = QuantityFactory.createYard(0);
        Quantity anotherZeroYard = QuantityFactory.createYard(0);

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = QuantityFactory.createYard(1);
        Quantity anotherOneYard = QuantityFactory.createYard(1);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenOneYardAndThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = QuantityFactory.createYard(1);
        Quantity threeFoot = QuantityFactory.createFoot(3);

        assertEquals(oneYard, threeFoot);
    }


    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInch = QuantityFactory.createInch(2.0);
        Quantity anotherTwoInch = QuantityFactory.createInch(2.0);


        assertEquals(QuantityFactory.createInch(4.0), ((AddableQuantity) twoInch).add(anotherTwoInch));

    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        Quantity OneFeet = QuantityFactory.createFoot(1.0);
        Quantity TwoInches = QuantityFactory.createInch(2.0);


        assertEquals(QuantityFactory.createInch(14.0), ((AddableQuantity) OneFeet).add(TwoInches));

    }

    @Test
    void givenTwoInchesAndOneFoot_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInches = QuantityFactory.createInch(2.0);
        Quantity oneFoot = QuantityFactory.createFoot(1.0);

        assertEquals(QuantityFactory.createInch(14.0), ((AddableQuantity) oneFoot).add(twoInches));

    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldGiveTwoFoot() {
        Quantity oneFoot = QuantityFactory.createFoot(1.0);
        Quantity anotherFoot = QuantityFactory.createFoot(1.0);

        assertEquals(QuantityFactory.createFoot(2.0), ((AddableQuantity) oneFoot).add(anotherFoot));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78 Liters
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeEqual() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity anotherOneGallon = QuantityFactory.createGallon(1.0);

        assertEquals(oneGallon, anotherOneGallon);
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeEqual() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity anotherOneLiter = QuantityFactory.createLiter(1.0);

        assertEquals(oneLiter, anotherOneLiter);
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldNotEqual() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity oneGallon = QuantityFactory.createGallon(1.0);

        assertNotEquals(oneLiter, oneGallon);
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldNotEqual() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity oneLiter = QuantityFactory.createLiter(1.0);

        assertNotEquals(oneGallon, oneLiter);
    }

    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity anotherOneGallon = QuantityFactory.createGallon(1.0);


        assertEquals(QuantityFactory.createGallon(2.0), ((AddableQuantity) oneGallon).add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity anotherOneLiter = QuantityFactory.createLiter(1.0);

        assertEquals(QuantityFactory.createLiter(2.0), ((AddableQuantity) oneLiter).add(anotherOneLiter));

    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity oneLiter = QuantityFactory.createLiter(1.0);

        assertEquals(QuantityFactory.createLiter(4.78), ((AddableQuantity) oneGallon).add(oneLiter));
    }

    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldNotEqual() {
        Quantity oneInch = QuantityFactory.createInch(1.0);
        Quantity oneLiter = QuantityFactory.createLiter(1.0);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenOneLiterAndOneInch_WhenEquals_ThenShouldNotEqual() {
        Quantity oneInch = QuantityFactory.createLiter(1.0);
        Quantity oneLiter = QuantityFactory.createInch(1.0);

        assertNotEquals(oneLiter, oneInch);
    }

    @Test
    void givenOneFeetAndOneGallon_WhenEquals_ThenShouldNotEqual() {
        Quantity oneFoot = QuantityFactory.createFoot(1.0);
        Quantity oneGallon = QuantityFactory.createGallon(1.0);

        assertNotEquals(oneFoot, oneGallon);
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldNotAdd() {

        assertThrows(Exception.class, () -> {
            QuantityFactory.createFoot(1.0).add(QuantityFactory.createGallon(1.0));
        });
    }

    @Test
    void givenOneGallonAndOneFoot_WhenAdd_ThenShouldNotAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuantityFactory.createGallon(1).add(QuantityFactory.createFoot(1));
        }, "Gallon and Foot are not same units");

    }

}
