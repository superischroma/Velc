package me.superischroma.velc.scene;

import me.superischroma.velc.obj.Inventory;
import me.superischroma.velc.item.PItem;
import me.superischroma.velc.util.Input;

public class SInventory extends Scene
{
    @Override
    public Scene open()
    {
        Inventory inv = player.getInventory();
        if (inv.size() == 0)
        {
            send("Your inventory is empty!");
        }
        else
        {
            send("Inventory:");
            for (PItem item : inv.getContents())
            {
                send(" - " + item.getName());
            }
        }
        send(ANYTHING_TO_CONTINUE);
        new Input(true);
        return new SMain();
    }
}
