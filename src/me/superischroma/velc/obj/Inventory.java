package me.superischroma.velc.obj;

import me.superischroma.velc.item.Item;
import me.superischroma.velc.item.PItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory
{
    private List<PItem> items;

    public Inventory()
    {
        items = new ArrayList<>();
    }

    public PItem getItem(int index)
    {
        return items.get(index);
    }

    public void addItem(Item item)
    {
        items.add(new PItem(item));
    }

    public void removeItem(PItem item)
    {
        items.remove(item);
    }

    public void removeItem(Item item, int amount)
    {
        int removed = 0;
        Iterator<PItem> it = items.iterator();
        while (it.hasNext())
        {
            PItem invItem = it.next();
            if (invItem.getObject() == item && removed <= amount)
            {
                it.remove();
                removed++;
            }
        }
    }

    public boolean contains(PItem item)
    {
        return items.contains(item);
    }

    public boolean contains(Item item, int amount)
    {
        int found = 0;
        for (PItem invItem : getContents())
        {
            if (invItem.getObject() == item)
            {
                found++;
            }
        }
        return found >= amount;
    }

    public int size()
    {
        return items.size();
    }

    public List<PItem> getContents()
    {
        return items;
    }
}