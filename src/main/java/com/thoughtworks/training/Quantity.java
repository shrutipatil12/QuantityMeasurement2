package com.thoughtworks.training;

import com.thoughtworks.training.Unit.IUnit;

public class Quantity {
    protected double value;
    protected final IUnit iunit;

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

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + iunit +
                '}';
    }
}
