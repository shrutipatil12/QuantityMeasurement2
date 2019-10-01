package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    public final IUnit iunit;

    private final int mathRoundValue = 100;


    public Quantity(double value, IUnit iunit) {
        this.value = value;
        this.iunit = iunit;

    }

    public static Quantity createFoot(double value) {
        return new Quantity(value, new Foot());
    }

    static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    static Quantity createGallon(double value) {

        return new Quantity(value, new Gallon());
    }

    static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
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
        return this.iunit.conversionToBase(this.value);
    }

    private boolean isNotSameTypeOfMeasurement(Quantity that) {
        return !this.iunit.getType().equals(that.iunit.getType());
    }

    public Quantity add(Quantity other) throws Exception {
        String message = "Could not add two different types of measurement";

        if (isNotSameTypeOfMeasurement(other)) {
            throw new Exception(message);
        }

        Quantity thisBase = getBaseQuantity();
        Quantity otherBase = other.getBaseQuantity();

        return new Quantity(thisBase.value + otherBase.value, thisBase.iunit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + iunit +
                '}';
    }
}
