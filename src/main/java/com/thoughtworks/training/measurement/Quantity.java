package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    public final Unit unit;

    private final int mathRoundValue = 100;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    static Quantity createFoot(double value) {
        return new Quantity(value, Unit.FOOT);
    }

    static Quantity createInch(double value) {
        return new Quantity(value, Unit.INCH);
    }

    static Quantity createYard(double value) {
        return new Quantity(value, Unit.YARD);
    }

    static Quantity createGallon(double value) {
        return new Quantity(value, Unit.GALLON);
    }

    static Quantity createLiter(double value) {
        return new Quantity(value, Unit.LITER);
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

        return getBaseQuantity().value == getThatBaseQuantity(that);

    }

    private double getThatBaseQuantity(Quantity that) {
        return (double) Math.round(that.getBaseQuantity().value * mathRoundValue) / mathRoundValue;
    }

    private Quantity getBaseQuantity() {
        return this.unit.conversionToBase(this.value);
    }

    private boolean isNotSameTypeOfMeasurement(Quantity that) {
        return !this.unit.type.equals(that.unit.type);
    }

    public Quantity add(Quantity other) throws Exception {
        String message = "Could not add two different types of measurement";

        if (isNotSameTypeOfMeasurement(other)) {
            throw new Exception(message);
        }

        Quantity thisBase = getBaseQuantity();
        Quantity otherBase = other.getBaseQuantity();
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
