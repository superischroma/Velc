package me.superischroma.velc;

import me.superischroma.velc.internal.CooldownManager;
import me.superischroma.velc.obj.Player;
import me.superischroma.velc.scene.SStart;
import me.superischroma.velc.scene.Scene;

public class Velc
{
    private static Velc application;
    public static Velc getApplication()
    {
        return application;
    }

    public Player player;

    public CooldownManager cm;

    public static void main(String[] args) throws InterruptedException
    {
        application = new Velc();
        application.cm = new CooldownManager();
        Scene currentScene = new SStart();
        while (true)
        {
            currentScene = currentScene.open();
            Thread.sleep(10);
        }
    }

    public static void disable()
    {
        application.player = null;
        application = null;
        System.exit(0);
    }
}