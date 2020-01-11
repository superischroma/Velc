package me.superischroma.velc.obj;

import me.superischroma.velc.item.Item;

public class Player
{
    private final String name;
    private int balance;
    private Inventory inventory;

    public Player(String name)
    {
        this.name = name;
        this.balance = 0;
        this.inventory = new Inventory();
    }

    public String getName()
    {
        return name;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public void give(int amount)
    {
        this.balance += amount;
    }

    public void give(Item item)
    {
        this.inventory.addItem(item);
    }
}