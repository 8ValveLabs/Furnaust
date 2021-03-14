package com.programax.furnaust.Abstract;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Ore
{
    public short maxStackSize = 1000;
    private final double smeltRate;
    private final double extractPerOre;

    public Ore(short maxStackSize, double smeltRate)
    {
        this.maxStackSize = maxStackSize;
        this.smeltRate = smeltRate;
        this.extractPerOre = 0.0;
    }

    public Ore(double smeltRate)
    {
        this.smeltRate = smeltRate;
        this.extractPerOre = 0.0;
    }

    public double calcWoodConsumed(short ore)
    {
        if (lessThanOne(ore))
            throw new IllegalArgumentException();
        else
            return round
                    (
                            0,
                            this.getSmeltRate() * ore
                    );
    }

    public double calcOreConsumed(short wood)
    {
        if (lessThanOne(wood))
            throw new IllegalArgumentException();
        else
        {
            return round
                    (
                            0,
                            wood / round(0,this.smeltRate)
                    );
        }
    }

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
