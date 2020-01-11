package me.superischroma.velc.scene;

import me.superischroma.velc.Velc;
import me.superischroma.velc.obj.Player;
import me.superischroma.velc.util.VConsole;

import java.util.Timer;

public abstract class Scene
{
    protected final String ANYTHING_TO_CONTINUE = "Type anything to continue.";
    protected final String COOLDOWN = "You're on cooldown for this feature.";

    protected final Velc application = Velc.getApplication();
    protected Player player = application.player;
    protected Timer timer = new Timer();

    public abstract Scene open();

    public void send(Object o)
    {
        VConsole.send(o);
    }
}