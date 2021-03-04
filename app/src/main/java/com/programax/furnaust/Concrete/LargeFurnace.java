package com.programax.furnaust.Concrete;

import com.programax.furnaust.Abstract.Furnace;
import com.programax.furnaust.Abstract.Ore;

import java.util.ArrayList;

public class LargeFurnace extends Furnace
{
    public LargeFurnace(byte slots, String imgResource, ArrayList<Ore> allowedOres)
    {
        super(slots, imgResource, allowedOres);
    }
}
