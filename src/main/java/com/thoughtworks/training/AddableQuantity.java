package com.thoughtworks.training;

import com.thoughtworks.training.Unit.IUnit;

public class AddableQuantity extends NonAddableQuantity {
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

    public AddableQuantity add(AddableQuantity other) throws IllegalArgumentException {

        AddableQuantity baseOne = (AddableQuantity) iunit.conversionToBase(value);
        AddableQuantity baseTwo = (AddableQuantity) other.iunit.conversionToBase(other.value);

        if (!(baseOne.iunit.equals(baseTwo.iunit))) {
            throw new IllegalArgumentException(baseOne.iunit + " and " + baseTwo.iunit + " are not same units");
        }

        return new AddableQuantity(baseOne.value + baseTwo.value, baseOne.iunit);
    }

    @Override
    public String toString() {
        return "AddableQuantity{" +
                "value=" + value +
                ", iunit=" + iunit +
                '}';
    }
}
