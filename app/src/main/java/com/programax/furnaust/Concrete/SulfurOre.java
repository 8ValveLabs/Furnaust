package com.programax.furnaust.Concrete;

import com.programax.furnaust.Abstract.Ore;

public class SulfurOre extends Ore
{
    public SulfurOre()
    {
        super(2.5);
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
