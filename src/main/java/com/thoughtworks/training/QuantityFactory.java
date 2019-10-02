package com.thoughtworks.training;

import com.thoughtworks.training.Unit.Length.Foot;
import com.thoughtworks.training.Unit.Length.Inch;
import com.thoughtworks.training.Unit.Length.Yard;
import com.thoughtworks.training.Unit.Temprature.Celsius;
import com.thoughtworks.training.Unit.Temprature.Fahrenheit;
import com.thoughtworks.training.Unit.Volume.Gallon;
import com.thoughtworks.training.Unit.Volume.Liter;

public class QuantityFactory {
    public static AddableQuantity createFoot(double value) {

        return new AddableQuantity(value, new Foot());
    }

    public static AddableQuantity createInch(double value) {

        return new AddableQuantity(value, new Inch());
    }

    public static AddableQuantity createYard(double value) {

        return new AddableQuantity(value, new Yard());
    }

    public static AddableQuantity createGallon(double value) {

        return new AddableQuantity(value, new Gallon());
    }

    public static AddableQuantity createLiter(double value) {

        return new AddableQuantity(value, new Liter());
    }

    public static NonAddableQuantity createCelsius(double value) {

        return new NonAddableQuantity(value, new Celsius());
    }

    public static NonAddableQuantity createFahrenheit(double value) {

        return new NonAddableQuantity(value, new Fahrenheit());
    }
}
