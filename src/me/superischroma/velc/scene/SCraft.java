package me.superischroma.velc.scene;

import me.superischroma.velc.item.Item;
import me.superischroma.velc.obj.Inventory;
import me.superischroma.velc.util.Input;

import java.util.HashMap;
import java.util.Map;

public class SCraft extends Scene
{
    private final String ITEMS_REQUIRED = "You don't have all the items required!";

    @Override
    public Scene open()
    {
        Item[] items = Item.values();
        Map<Integer, Item> positionTracker = new HashMap<>();
        int numTracker = 1;
        send("Craft something:");
        for (Item item : items)
        {
            if (!item.isCraftable())
                continue;
            send(" - [" + numTracker + "] " + item.getName());
            positionTracker.put(numTracker, item);
            numTracker++;
        }
        send(" - [" + numTracker + "] Return");
        Input in = new Input();
        int num;
        try
        {
            num = Integer.parseInt(in.received());
        }
        catch (NumberFormatException ex)
        {
            return new SCraft();
        }
        if (num < 1 || num > positionTracker.size() + 1)
        {
            return new SFail("Invalid number.", new SCraft());
        }
        if (num == positionTracker.size() + 1)
        {
            send("Leaving the crafting area...");
            return new SMain();
        }
        Item item = positionTracker.get(num);
        Inventory inv = player.getInventory();
        switch (item)
        {
            case COMPACT_COAL:
            {
                if (!inv.contains(Item.COAL, 100))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COAL, 100);
                break;
            }
            case COMPACT_STONE:
            {
                if (!inv.contains(Item.STONE, 20))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.STONE, 20);
                break;
            }
            case COMPACT_IRON:
            {
                if (!inv.contains(Item.IRON, 20))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.IRON, 20);
                break;
            }
            case COMPACT_GOLD:
            {
                if (!inv.contains(Item.GOLD, 50))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.GOLD, 50);
                break;
            }
            case COMPACT_DIAMOND:
            {
                if (!inv.contains(Item.DIAMOND, 50))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.DIAMOND, 50);
                break;
            }
            case PERFECT_GOLD:
            {
                if (!inv.contains(Item.COMPACT_GOLD, 5))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COMPACT_GOLD, 5);
                break;
            }
            case PERFECT_DIAMOND:
            {
                if (!inv.contains(Item.COMPACT_DIAMOND, 5))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COMPACT_DIAMOND, 5);
                break;
            }
            case PERFECT_CRYSTAL:
            {
                if (!inv.contains(Item.PERFECT_DIAMOND, 2))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_DIAMOND, 2);
                break;
            }
            case STONE_SWORD:
            {
                if (!inv.contains(Item.STONE, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.STONE, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case IRON_SWORD:
            {
                if (!inv.contains(Item.IRON, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.IRON, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case GOLD_SWORD:
            {
                if (!inv.contains(Item.GOLD, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.GOLD, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case DIAMOND_SWORD:
            {
                if (!inv.contains(Item.DIAMOND, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.DIAMOND, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case COMPACT_STONE_SWORD:
            {
                if (!inv.contains(Item.COMPACT_STONE, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COMPACT_STONE, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case COMPACT_IRON_SWORD:
            {
                if (!inv.contains(Item.COMPACT_IRON, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COMPACT_IRON, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case COMPACT_GOLD_SWORD:
            {
                if (!inv.contains(Item.COMPACT_GOLD, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COMPACT_GOLD, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case COMPACT_DIAMOND_SWORD:
            {
                if (!inv.contains(Item.COMPACT_DIAMOND, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.COMPACT_DIAMOND, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case PERFECT_GOLD_SWORD:
            {
                if (!inv.contains(Item.PERFECT_GOLD, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_GOLD, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case PERFECT_DIAMOND_SWORD:
            {
                if (!inv.contains(Item.PERFECT_DIAMOND, 2) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_DIAMOND, 2);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case OLD_PERFECT_SWORD:
            {
                if (!inv.contains(Item.PERFECT_CRYSTAL, 6) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_CRYSTAL, 6);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case STRONG_PERFECT_SWORD:
            {
                if (!inv.contains(Item.PERFECT_CRYSTAL, 8) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_CRYSTAL, 8);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case WISE_PERFECT_SWORD:
            {
                if (!inv.contains(Item.PERFECT_CRYSTAL, 10) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_CRYSTAL, 10);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case LEGENDARY_PERFECT_SWORD:
            {
                if (!inv.contains(Item.PERFECT_CRYSTAL, 12) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_CRYSTAL, 12);
                inv.removeItem(Item.STICK, 1);
                break;
            }
            case SUPERIOR_PERFECT_SWORD:
            {
                if (!inv.contains(Item.PERFECT_CRYSTAL, 20) && !inv.contains(Item.STICK, 1))
                {
                    return new SFail(ITEMS_REQUIRED, new SCraft());
                }
                inv.removeItem(Item.PERFECT_CRYSTAL, 20);
                inv.removeItem(Item.STICK, 1);
                break;
            }
        }
        inv.addItem(item);
        send("Successfully crafted " + item.getName() + "!");
        send(ANYTHING_TO_CONTINUE);
        new Input(true);
        return new SCraft();
    }
}