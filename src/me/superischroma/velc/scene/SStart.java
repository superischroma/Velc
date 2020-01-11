package me.superischroma.velc.scene;

import me.superischroma.velc.obj.Player;
import me.superischroma.velc.util.Input;

public class SStart extends Scene
{
    @Override
    public Scene open()
    {
        send("Welcome to Velc");
        send("Enter your name to start.");
        Input in = new Input();
        application.player = new Player(in.received());
        return new SMain();
    }
}