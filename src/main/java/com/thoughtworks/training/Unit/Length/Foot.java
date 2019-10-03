package com.thoughtworks.training.Unit.Length;

import com.thoughtworks.training.Unit.IUnit;
import com.thoughtworks.training.NonAddableQuantity;
import com.thoughtworks.training.QuantityFactory;

public class Foot implements IUnit {
    private final int conversionFactor = 12;

    @Override
    public NonAddableQuantity conversionToBase(double value) {

        return QuantityFactory.createInch(value * conversionFactor);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Foot;
    }

    @Override
    public String toString() {
        return "Foot{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }

}
