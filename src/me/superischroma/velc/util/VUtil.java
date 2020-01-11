package me.superischroma.velc.util;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class VUtil
{
    private static final String CHARACTER_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String NUMBER_STRING = "0123456789";

    public static char getRandomStringNumber()
    {
        return NUMBER_STRING.charAt(new SecureRandom().nextInt(NUMBER_STRING.length()));
    }

    public static String generateID()
    {
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 16; i++)
        {
            id.append(getRandomStringNumber());
        }
        return id.toString();
    }

    public static int random(int min, int max)
    {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static boolean sleep(int millis)
    {
        try
        {
            Thread.sleep(millis);
            return true;
        }
        catch (InterruptedException ex)
        {
            return false;
        }
    }

    public static Object getRandomFromArray(List<?> list)
    {
        return list.get(new Random().nextInt(list.size()));
    }
}