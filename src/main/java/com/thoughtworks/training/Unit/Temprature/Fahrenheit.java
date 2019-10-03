package com.thoughtworks.training.Unit.Temprature;

import com.thoughtworks.training.NonAddableQuantity;
import com.thoughtworks.training.QuantityFactory;
import com.thoughtworks.training.Unit.IUnit;

public class Fahrenheit implements IUnit {
    @Override
    public NonAddableQuantity conversionToBase(double value) {
        return QuantityFactory.createCelsius(((value - 32) * 5.0) / 9.0);
    }

    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public String toString() {
        return "Fahrenheit{}";
    }
}
