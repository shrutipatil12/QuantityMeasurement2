package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1), FOOT(12), YARD(36), LITER(1), GALLON(3.78);

    private double conversionFactor;
    Unit unit;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;

    }

    double conversionToBase(double value) {
        return value * conversionFactor;

    }

}

