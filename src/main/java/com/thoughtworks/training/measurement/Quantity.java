package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    public final Unit unit;

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

        if (this.unit.baseUnit() != that.unit.baseUnit()) {
            return false;
        }

        return this.unit.conversionToBase(this.value) == (double) Math.round(that.unit.conversionToBase(that.value) * 100) / 100;

    }

    public Quantity add(Quantity other) {

        if (this.unit == Unit.INCH || this.unit == Unit.FOOT) {
            return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.INCH);
        }
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.LITER);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
