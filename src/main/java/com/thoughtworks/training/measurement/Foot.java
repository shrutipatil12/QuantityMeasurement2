package com.thoughtworks.training.measurement;


import static com.thoughtworks.training.measurement.Quantity.createInch;

public class Foot implements IUnit {
    private final int conversionFactor = 12;

    @Override
    public Quantity conversionToBase(double value) {
        return createInch(value * conversionFactor);
    }

    @Override
    public Unit getType() {
        return Unit.INCH;
    }

    @Override
    public String toString() {
        return "Foot{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}
