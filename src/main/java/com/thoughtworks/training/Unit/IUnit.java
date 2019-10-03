package com.thoughtworks.training.Unit;

import com.thoughtworks.training.NonAddableQuantity;

public interface IUnit {
    NonAddableQuantity conversionToBase(double value);
}
