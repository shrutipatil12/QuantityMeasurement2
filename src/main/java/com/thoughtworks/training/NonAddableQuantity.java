package com.thoughtworks.training;

import com.thoughtworks.training.Unit.IUnit;

public class NonAddableQuantity {
    protected double value;
    protected final IUnit iunit;

    public NonAddableQuantity(double value, IUnit iunit) {
        this.value = value;
        this.iunit = iunit;

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonAddableQuantity)) {
            return false;
        }

        NonAddableQuantity that = (NonAddableQuantity) other;

        NonAddableQuantity baseOne = iunit.conversionToBase(value);
        NonAddableQuantity baseTwo = that.iunit.conversionToBase(that.value);
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
