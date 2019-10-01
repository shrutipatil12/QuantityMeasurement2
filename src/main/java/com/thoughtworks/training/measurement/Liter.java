package com.thoughtworks.training.measurement;

import static com.thoughtworks.training.measurement.Quantity.createLiter;

public class Liter implements IUnit {
    private final int conversionFactor = 1;

    @Override
    public Quantity conversionToBase(double value) {

        return createLiter(value * conversionFactor);
    }

    @Override
    public Unit getType() {
        return Unit.LITER;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Inch)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Liter{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

