package me.superischroma.velc.scene;

import me.superischroma.velc.util.Input;

public class SFail extends Scene
{
    private String message;
    private Scene to;

    public SFail(String message, Scene to)
    {
        this.message = message;
        this.to = to;
    }

    public SFail(String message)
    {
        this(message, new SMain());
    }

    @Override
    public Scene open()
    {
        send(message);
        send(ANYTHING_TO_CONTINUE);
        new Input(true);
        return to;
    }
}
