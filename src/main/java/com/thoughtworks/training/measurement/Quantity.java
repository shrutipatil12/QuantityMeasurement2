package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;

            if (this.unit == Unit.LITER && that.unit == Unit.INCH || this.unit == Unit.INCH && that.unit == Unit.LITER)
                return false;
            if (this.unit == Unit.LITER && that.unit == Unit.FOOT || this.unit == Unit.FOOT && that.unit == Unit.LITER)
                return false;
            if (this.unit == Unit.GALLON && that.unit == Unit.INCH || this.unit == Unit.INCH && that.unit == Unit.GALLON)
                return false;

            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);

        }
        return false;
    }

    public Quantity add(Quantity other) {
//        String message = "IllegalException";
//
//        if (this.unit == Unit.INCH && other.unit == Unit.LITER) {
//            throw new Exception(message);
//        }
        if (this.unit == Unit.INCH || this.unit == Unit.FOOT) {
            return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.INCH);
        }
//    }
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.LITER);
    }
}
