package me.superischroma.velc.internal;

import me.superischroma.velc.scene.EScene;
import me.superischroma.velc.scene.Scene;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class CooldownManager
{
    private Timer timer = new Timer();

    private Map<EScene, Integer> cooldown;

    public CooldownManager()
    {
        cooldown = new HashMap<>();
    }

    public void cooldown(EScene scene, int timeout)
    {
        cooldown.put(scene, timeout);
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                cooldown.remove(scene);
            }
        }, timeout * 1000);
    }

    public boolean onCooldown(EScene scene)
    {
        return cooldown.containsKey(scene);
    }
}