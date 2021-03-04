package com.programax.furnaust.Abstract;

import java.util.ArrayList;

public abstract class Furnace
{
    public byte slots;
    public short maxStackSize = 1000;
    public String imgResource;
    public ArrayList<Ore> allowedOres;
    private double charcoalPerWoodPercent;

    public Furnace(byte slots, short maxStackSize, String imgResource, ArrayList<Ore> allowedOres)
    {
        this.slots = slots;
        this.maxStackSize = maxStackSize;
        this.imgResource = imgResource;
        this.allowedOres = allowedOres;
    }

    public Furnace(byte slots, String imgResource, ArrayList<Ore> allowedOres)
    {
        this.slots = slots;
        this.imgResource = imgResource;
        this.allowedOres = allowedOres;
    }
}
