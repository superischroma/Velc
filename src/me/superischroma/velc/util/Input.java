package me.superischroma.velc.util;

import java.util.Scanner;

public class Input
{
    private final Scanner scn;

    public Input(boolean anything)
    {
        scn = new Scanner(System.in);
        if (anything)
            received();
    }

    public Input()
    {
        this(false);
    }

    public String received()
    {
        return scn.next();
    }

    public void end()
    {
        scn.close();
    }
}