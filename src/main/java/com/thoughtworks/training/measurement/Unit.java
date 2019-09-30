package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, UnitType.length),
    FOOT(12, UnitType.length),
    YARD(36, UnitType.length),
    LITER(1, UnitType.volume),
    GALLON(3.78, UnitType.volume);

    enum UnitType {
        length,
        volume
    }

    private double conversionFactor;
    protected UnitType type;

    Unit(double conversionFactor, UnitType type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }

}

