package me.superischroma.velc.util;

import java.util.Scanner;

public class VConsole
{
    public static void send(Object o)
    {
        System.out.println(o);
    }

    public static void sendnl(Object o)
    {
        System.out.print(o);
    }

    public static void sendf(Object o, Object... objects)
    {
        System.out.printf(String.valueOf(o), objects);
        System.out.println();
    }

    public static String in()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}