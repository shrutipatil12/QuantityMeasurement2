package com.thoughtworks.training.Unit.Temprature;

import com.thoughtworks.training.NonAddableQuantity;
import com.thoughtworks.training.QuantityFactory;
import com.thoughtworks.training.Unit.IUnit;

public class Celsius implements IUnit {
    @Override
    public NonAddableQuantity conversionToBase(double value) {
        return QuantityFactory.createCelsius(value);
    }

    @Override
    public boolean equals(Object other) {
    return other instanceof IUnit;
    }

    @Override
    public String toString() {
        return "Celsius{}";
    }
}
