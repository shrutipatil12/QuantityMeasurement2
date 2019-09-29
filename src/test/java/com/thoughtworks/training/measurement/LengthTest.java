package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Length zeroFoot = new Length(0, Unit.FOOT);
        Length anotherZeroFoot = new Length(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Length zeroFoot = new Length(0, Unit.FOOT);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1, Unit.FOOT);
        Length twoFoot = new Length(2, Unit.FOOT);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Length oneFoot = new Length(1.0, Unit.FOOT);
        Length otherFoot = new Length(1.0, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1, Unit.FOOT);
        Length twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Length zeroInch = new Length(0, Unit.INCH);
        Length anotherZeroInch = new Length(0, Unit.INCH);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Length zeroInch = new Length(0, Unit.INCH);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Length oneFoot = new Length(1, Unit.FOOT);
        Length otherFoot = new Length(1, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Length oneInch = new Length(1, Unit.INCH);
        Length twoInch = new Length(2, Unit.INCH);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneInch = new Length(1, Unit.INCH);
        Length twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1, Unit.INCH);
        Length oneFoot = new Length(1, Unit.FOOT);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Length zeroInch = new Length(0, Unit.INCH);
        Length zeroFoot = new Length(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Length twelveInch = new Length(12, Unit.INCH);
        Length oneFoot = new Length(1, Unit.FOOT);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Length twentyFourInch = new Length(24, Unit.INCH);
        Length twoFeet = new Length(2, Unit.FOOT);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Length twelveInch = new Length(12, Unit.INCH);
        Length oneFoot = new Length(1, Unit.FOOT);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Length zeroYard = new Length(0, Unit.YARD);
        Length anotherZeroYard = new Length(0, Unit.YARD);

        assertTrue(zeroYard.equals(anotherZeroYard));
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Length oneYard = new Length(1, Unit.YARD);
        Length anotherOneYard = new Length(1, Unit.YARD);

        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Length oneYard = new Length(1, Unit.YARD);
        Length seventyTwoInches = new Length(3, Unit.FOOT);

        assertTrue(oneYard.equals(seventyTwoInches));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Length zeroInch = new Length(0.0, Unit.INCH);
        Length anotherZeroInch = new Length(0.0, Unit.INCH);

        assertEquals(new Length(0.0, Unit.INCH), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Length twoInch = new Length(2.0, Unit.INCH);
        Length anotherTwoInch = new Length(2.0, Unit.INCH);

        assertEquals(new Length(4.0, Unit.INCH), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        Length OneFeet = new Length(1.0, Unit.FOOT);
        Length TwoInches = new Length(2.0, Unit.INCH);

        assertEquals(new Length(14.0, Unit.INCH), OneFeet.add(TwoInches));
    }

}
