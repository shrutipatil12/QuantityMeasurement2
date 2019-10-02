package com.thoughtworks.training;

import com.thoughtworks.training.Unit.Length.Foot;
import com.thoughtworks.training.Unit.Length.Inch;
import com.thoughtworks.training.Unit.Length.Yard;
import com.thoughtworks.training.Unit.Volume.Gallon;
import com.thoughtworks.training.Unit.Volume.Liter;

public class QuantityFactory {
    public static Quantity createFoot(double value) {

        return new Quantity(value, new Foot());
    }

    public static Quantity createInch(double value) {

        return new Quantity(value, new Inch());
    }

    static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    static Quantity createGallon(double value)
    {

        return new Quantity(value, new Gallon());
    }

    public static Quantity createLiter(double value)
    {
        return new Quantity(value, new Liter());
    }
}
