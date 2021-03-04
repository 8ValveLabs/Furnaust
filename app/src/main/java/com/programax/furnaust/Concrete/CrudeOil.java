package com.programax.furnaust.Concrete;

import com.programax.furnaust.Abstract.Ore;

public class CrudeOil extends Ore
{
    public CrudeOil()
    {
        super(6.67);
    }

    @Override
    public double calcWoodConsumed(short ore)
    {
        if (lessThanOne(ore))
            throw new IllegalArgumentException();
        else
            return super.round
            (
                    0,
                    this.getSmeltRate() * ore
            );
    }

    /*
    * this is currently not implemented
    */
    @Override
    public double calcOreConsumed(short wood)
    {
        if (lessThanOne(wood))
            throw new IllegalArgumentException();
        else
            return super.round(
                    0,
                    0.00
            );
    }
}
