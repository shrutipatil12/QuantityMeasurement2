package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    public final Unit unit;

    private final int mathRoundValue = 100;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quantity)) {
            return false;
        }
        Quantity that = (Quantity) other;

        if (isNotSameTypeOfMeasurement(that)) {
            return false;
        }

        return this.unit.conversionToBase(this.value).value == (double) Math.round(that.unit.conversionToBase(that.value).value * mathRoundValue) / mathRoundValue;

    }

    private boolean isNotSameTypeOfMeasurement(Quantity that) {
        return !this.unit.type.equals(that.unit.type);
    }

    public Quantity add(Quantity other) throws Exception {
        String message = "Could not add two different types of measurement";

        if (isNotSameTypeOfMeasurement(other)) {
            throw new Exception(message);
        }

        Quantity thisBase = this.unit.conversionToBase(this.value);
        Quantity otherBase = other.unit.conversionToBase(other.value);
        return new Quantity(thisBase.value + otherBase.value, thisBase.unit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
