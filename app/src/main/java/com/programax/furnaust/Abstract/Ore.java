package com.programax.furnaust.Abstract;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Ore
{
    public short maxStackSize = 1000;
    private final double smeltRate;

    public Ore(short maxStackSize, double smeltRate)
    {
        this.maxStackSize = maxStackSize;
        this.smeltRate = smeltRate;
    }

    public Ore(double smeltRate)
    {
        this.smeltRate = smeltRate;
    }

    public abstract double calcWoodConsumed(short ore);

    public abstract double calcOreConsumed(short wood);

    public double getSmeltRate()
    {
        return this.smeltRate;
    }

    public double round(int precision, double value)
    {
        if (precision < 0) throw new IllegalArgumentException();
        BigDecimal valueAsBD = convertDoubleToBD(value);
        valueAsBD = setPrecision(valueAsBD, 0);
        return convertBdToDouble(valueAsBD);
    }

    public boolean lessThanOne(short value)
    {
        return (value < 1);
    }

    private BigDecimal setPrecision(BigDecimal bd, int precision)
    {
        return bd.setScale(precision, RoundingMode.HALF_UP);
    }

    private BigDecimal convertDoubleToBD(double value)
    {
        return new BigDecimal(Double.toString(value));
    }

    private Double convertBdToDouble(BigDecimal Bd)
    {
        return Bd.doubleValue();
    }


}
