package com.thoughtworks.training.measurement;

import static com.thoughtworks.training.measurement.Quantity.createLiter;

public class Gallon implements IUnit {
    private final double conversionFactor = 3.78;

    @Override
    public Quantity conversionToBase(double value) {
        return createLiter(value * conversionFactor);

    }

    @Override
    public Unit getType() {
        return Unit.LITER;
    }

    @Override
    public String toString() {
        return "Gallon{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}
