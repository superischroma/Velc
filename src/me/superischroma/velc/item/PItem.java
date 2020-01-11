package me.superischroma.velc.item;

import me.superischroma.velc.util.VUtil;

public class PItem
{
    private final Item object;
    private final String name;
    private final String id;

    public PItem(Item object)
    {
        this.object = object;
        this.name = object.getName();
        this.id = VUtil.generateID();
    }

    public Item getObject()
    {
        return object;
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return id;
    }
}