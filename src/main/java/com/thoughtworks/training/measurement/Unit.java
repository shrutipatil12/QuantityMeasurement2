package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, Measurement.length),
    FOOT(12, Measurement.length),
    YARD(36, Measurement.length),
    LITER(1, Measurement.volume),
    GALLON(3.78, Measurement.volume);

    enum Measurement {
        length,
        volume
    }

    private double conversionFactor;
    protected Measurement type;

    Unit(double conversionFactor, Measurement type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }

}

