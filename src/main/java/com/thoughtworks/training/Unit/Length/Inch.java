package com.thoughtworks.training.Unit.Length;

import com.thoughtworks.training.Unit.IUnit;
import com.thoughtworks.training.NonAddableQuantity;
import com.thoughtworks.training.QuantityFactory;

public class Inch implements IUnit {
    private final int conversionFactor = 1;

    @Override
    public NonAddableQuantity conversionToBase(double value) {
        return QuantityFactory.createInch(value * conversionFactor);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Inch;
    }

    @Override
    public String toString() {
        return "Inch{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}
