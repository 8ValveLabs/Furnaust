package com.programax.furnaust.Concrete;

import com.programax.furnaust.Abstract.Ore;

public class MetalOre extends Ore
{
    public MetalOre()
    {
        super(5.0);
    }

    @Override
    public double calcWoodConsumed(short ore) {
        return 0;
    }

    @Override
    public double calcOreConsumed(short wood) {
        return 0;
    }
}
