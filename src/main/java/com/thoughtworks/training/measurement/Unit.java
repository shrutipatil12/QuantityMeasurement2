package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, Measurement.length),
    FOOT(12, Measurement.length, Unit.INCH),
    YARD(36, Measurement.length, Unit.INCH),
    LITER(1, Measurement.volume),
    GALLON(3.78, Measurement.volume, Unit.LITER);

    enum Measurement {
        length,
        volume
    }

    private double conversionFactor;
    protected Measurement type;
    private Unit baseUnit;

    Unit(double conversionFactor, Measurement type, Unit baseUnit) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.baseUnit = baseUnit;
    }

    Unit(double conversionFactor, Measurement type) {
        this.conversionFactor = conversionFactor;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Unit{" +
                "conversionFactor=" + conversionFactor +
                ", type=" + type +
                ", baseUnit=" + baseUnit +
                '}';
    }
}

