package me.superischroma.velc.scene;

import me.superischroma.velc.item.Item;
import me.superischroma.velc.util.Input;
import me.superischroma.velc.util.VUtil;

import java.util.Arrays;
import java.util.List;

public class SSearch extends Scene
{
    private final List<String> locations = Arrays.asList("Kitchen", "Sofa", "Bed", "Sidewalk", "Drawer", "Shoe");

    @Override
    public Scene open()
    {
        if (application.cm.onCooldown(EScene.SEARCH))
        {
            return new SFail(COOLDOWN);
        }
        String location = String.valueOf(VUtil.getRandomFromArray(locations));
        send("Searching your surroundings...");
        VUtil.sleep(3000);
        int amount = VUtil.random(50, 100);
        player.give(amount);
        send(location + " - Found " + amount + " coins!");
        application.cm.cooldown(EScene.SEARCH, 30);
        send(ANYTHING_TO_CONTINUE);
        new Input(true);
        return new SMain();
    }
}