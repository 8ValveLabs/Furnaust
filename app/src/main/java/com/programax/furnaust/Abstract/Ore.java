package com.programax.furnaust.Abstract;

public abstract class Ore
{
    public short maxStackSize = 1000;
    private double smeltRate;

    public Ore(short maxStackSize, double smeltRate)
    {
        this.maxStackSize = maxStackSize;
        this.smeltRate = smeltRate;
    }

    public Ore(double smeltRate)
    {
        this.smeltRate = smeltRate;
    }
}
