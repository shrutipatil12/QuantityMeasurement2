package com.thoughtworks.training;

import com.thoughtworks.training.Unit.IUnit;

public class NonAddableQuantity extends Quantity {
    private final double value;
    private final IUnit iunit;

    public NonAddableQuantity(double value, IUnit iunit) {
        super(value, iunit);
        this.iunit = iunit;
        this.value = value;
    }
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }
}
