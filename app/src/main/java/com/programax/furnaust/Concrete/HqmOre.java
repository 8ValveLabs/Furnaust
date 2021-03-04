package com.programax.furnaust.Concrete;

import com.programax.furnaust.Abstract.Ore;

public class HqmOre extends Ore
{
    public HqmOre()
    {
        super(10.0);
    }

    public double calcWoodConsumed(short ore)
    {
        return 0.0;
    }
    public double calcOreConsumed(short wood)
    {
        return 0.0;
    }
}
