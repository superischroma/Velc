package me.superischroma.velc.scene;

import me.superischroma.velc.item.Item;
import me.superischroma.velc.item.PItem;
import me.superischroma.velc.util.Input;

import java.util.HashMap;
import java.util.Map;

public class SShop extends Scene
{
    @Override
    public Scene open()
    {
        send("Welcome to the Velc Shop!");
        Item[] items = Item.values();
        if (items.length == 0)
        {
            send("No items are up for sale right now!");
            send(ANYTHING_TO_CONTINUE);
            new Input(true);
            return new SMain();
        }
        else
        {
            int numTracker = 1;
            Map<Item, Integer> selectionTracker = new HashMap<>();
            send("Here is our list of items (and the return option):");
            for (Item item : items)
            {
                if (!item.isPurchaseable())
                    continue;
                send(" - [" + numTracker + "] " + item.getName() + ": " + item.getCost());
                selectionTracker.put(item, numTracker);
                numTracker++;
            }
            send(" - [" + numTracker + "] Return");
            send("Please make a selection.");
            Input in = new Input();
            int num;
            try
            {
                num = Integer.parseInt(in.received());
            }
            catch (NumberFormatException ex)
            {
                return new SFail("Invalid number.", new SShop());
            }
            if (num == selectionTracker.size() + 1)
            {
                send("Leaving the shop...");
                return new SMain();
            }
            for (Item item : items)
            {
                if (!selectionTracker.containsKey(item))
                    continue;
                if (selectionTracker.get(item) == num)
                {
                    if (item.getCost() > player.getBalance())
                    {
                        return new SFail("Insufficient funds.", new SShop());
                    }

                    player.give(item);
                    player.setBalance(player.getBalance() - item.getCost());
                    send("You bought " + item.getName() + " for " + item.getCost() + " coins!");
                    send(ANYTHING_TO_CONTINUE);
                    new Input(true);
                }
            }
        }
        return new SShop();
    }
}