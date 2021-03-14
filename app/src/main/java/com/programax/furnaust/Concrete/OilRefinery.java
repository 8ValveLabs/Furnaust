package com.programax.furnaust.Concrete;

import com.programax.furnaust.Abstract.Furnace;
import com.programax.furnaust.Abstract.Ore;

import java.util.ArrayList;

public class OilRefinery extends Furnace
{
    public OilRefinery(byte slots, String imgResource, Ore [] allowedOres)
    {
        super(slots, imgResource, allowedOres);
    }
}
