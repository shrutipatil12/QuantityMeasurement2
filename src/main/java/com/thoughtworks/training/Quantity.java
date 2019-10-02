package com.thoughtworks.training;

import com.thoughtworks.training.Unit.IUnit;

public class Quantity {
    private double value;
    private final IUnit iunit;

    public Quantity(double value, IUnit iunit) {
        this.value = value;
        this.iunit = iunit;

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quantity)) {
            return false;
        }

        Quantity that = (Quantity) other;

        Quantity baseOne = iunit.conversionToBase(value);
        Quantity baseTwo = that.iunit.conversionToBase(that.value);
        return Math.abs(baseOne.value - baseTwo.value) <= 0.01 && baseOne.iunit.equals(baseTwo.iunit);

    }
    public Quantity add(Quantity other) throws Exception {

        Quantity baseOne = iunit.conversionToBase(value);
        Quantity baseTwo = other.iunit.conversionToBase(other.value);
        String message = "Could not add two different types of measurement";

        if (!(baseOne.iunit.equals(baseTwo.iunit))) {
            throw new Exception(message);
        }

        return new Quantity(baseOne.value + baseTwo.value, baseOne.iunit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + iunit +
                '}';
    }
}
