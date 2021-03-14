package com.programax.furnaust.Abstract;

import com.programax.furnaust.Concrete.CrudeOil;
import com.programax.furnaust.Concrete.MetalOre;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Furnace
{
    public byte slots;
    public short maxStackSize = 1000;
    public String imgResource;
    public Ore [] allowedOres;
    private double charcoalPerWoodPercent;

    public Furnace(byte slots, short maxStackSize, String imgResource, Ore [] allowedOres)
    {
        this.slots = slots;
        this.maxStackSize = maxStackSize;
        this.imgResource = imgResource;
        this.allowedOres = allowedOres;
    }


    public Furnace(byte slots, String imgResource, Ore [] allowedOres)
    {
        this.slots = slots;
        this.imgResource = imgResource;
        this.allowedOres = allowedOres;
    }
}
