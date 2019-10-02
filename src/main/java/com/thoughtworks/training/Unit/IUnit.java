package com.thoughtworks.training.Unit;

import com.thoughtworks.training.Quantity;

public interface IUnit {
    Quantity conversionToBase(double value);
}
