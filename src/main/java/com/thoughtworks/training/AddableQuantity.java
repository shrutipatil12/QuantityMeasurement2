package com.thoughtworks.training;

import com.thoughtworks.training.Unit.IUnit;

public class AddableQuantity extends Quantity {
    private final double value;
    private final IUnit iunit;

    public AddableQuantity(double value, IUnit iunit) {
        super(value, iunit);
        this.value = value;
        this.iunit = iunit;
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    public Quantity add(Quantity other) throws IllegalArgumentException {

        Quantity baseOne = iunit.conversionToBase(value);
        Quantity baseTwo = other.iunit.conversionToBase(other.value);

        if (!(baseOne.iunit.equals(baseTwo.iunit))) {
            throw new IllegalArgumentException(baseOne.iunit + " and " + baseTwo.iunit + " are not same units");
        }

        return new Quantity(baseOne.value + baseTwo.value, baseOne.iunit);
    }

    @Override
    public String toString() {
        return "AddableQuantity{" +
                "value=" + value +
                ", iunit=" + iunit +
                '}';
    }
}
