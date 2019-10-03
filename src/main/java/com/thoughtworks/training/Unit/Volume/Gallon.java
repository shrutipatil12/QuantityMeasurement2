package com.thoughtworks.training.Unit.Volume;

import com.thoughtworks.training.Unit.IUnit;
import com.thoughtworks.training.NonAddableQuantity;
import com.thoughtworks.training.QuantityFactory;

public class Gallon implements IUnit {
    private final double conversionFactor = 3.78;

    @Override
    public NonAddableQuantity conversionToBase(double value) {
        return QuantityFactory.createLiter(value * conversionFactor);

    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Gallon;
    }

    @Override
    public String toString() {
        return "Gallon{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}
