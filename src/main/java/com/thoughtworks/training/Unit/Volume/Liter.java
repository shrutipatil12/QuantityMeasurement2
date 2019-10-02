package com.thoughtworks.training.Unit.Volume;

import com.thoughtworks.training.Unit.IUnit;
import com.thoughtworks.training.Quantity;
import com.thoughtworks.training.QuantityFactory;

public class Liter implements IUnit {
    private final int conversionFactor = 1;

    @Override
    public Quantity conversionToBase(double value) {

        return QuantityFactory.createLiter(value * conversionFactor);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Liter;
    }

    @Override
    public String toString() {
        return "Liter{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

