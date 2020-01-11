package me.superischroma.velc.scene;

import me.superischroma.velc.Velc;
import me.superischroma.velc.util.Input;

public class SMain extends Scene
{
    private final String WIP_MESSAGE = "This section is currently a work in progress.";

    @Override
    public Scene open()
    {
        send(player.getName() + "'s Profile");
        send("Balance: " + player.getBalance());
        send("Actions:");
        send(" - [1] View Inventory");
        send(" - [2] Shop");
        send(" - [3] Craft");
        send(" - [4] Search Surroundings");
        send(" - [5] Exit");
        Input in = new Input();
        int num;
        try
        {
            num = Integer.parseInt(in.received());
        }
        catch (NumberFormatException ex)
        {
            return new SMain();
        }
        switch (num)
        {
            // view inventory
            case 1:
            {
                return new SInventory();
            }
            // go to shop
            case 2:
            {
                return new SShop();
            }
            // craft items
            case 3:
            {
                return new SCraft();
            }
            // search surroundings
            case 4:
            {
                return new SSearch();
            }
            // exit game
            case 5:
            {
                send("Exiting...");
                in.end();
                Velc.disable();
                break;
            }
        }
        return new SMain();
    }
}
