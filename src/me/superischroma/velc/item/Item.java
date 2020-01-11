package me.superischroma.velc.item;

// yes lots of inspiration from hypixel skyblock in here
public enum Item
{
    STICK("Stick", 1, Rarity.COMMON, true, false),
    COAL("Coal", 5, Rarity.COMMON, true, false),
    STONE("Stone", 50, Rarity.COMMON, true, false),
    IRON("Iron", 250, Rarity.COMMON, true, false),
    GOLD("Gold", 1000, Rarity.UNCOMMON, true, false),
    DIAMOND("Diamond", 2000, Rarity.UNCOMMON, true, false),
    COMPACT_COAL("Compact Coal", 500, Rarity.COMMON, false, true),
    COMPACT_STONE("Compact Stone", 1000, Rarity.UNCOMMON, false, true),
    COMPACT_IRON("Compact Iron", 5000, Rarity.UNCOMMON, false, true),
    COMPACT_GOLD("Compact Gold", 50000, Rarity.RARE, false, true),
    COMPACT_DIAMOND("Compact Diamond", 100000, Rarity.EPIC, false, true),
    PERFECT_GOLD("Perfect Gold", 250000, Rarity.EPIC, false, true),
    PERFECT_DIAMOND("Perfect Diamond", 500000, Rarity.EPIC, false, true),
    PERFECT_CRYSTAL("Perfect Crystal", 1000000, Rarity.LEGENDARY, false, true),
    STONE_SWORD("Stone Sword", 100, Rarity.COMMON, true, true),
    IRON_SWORD("Iron Sword", 500, Rarity.COMMON, true, true),
    GOLD_SWORD("Gold Sword", 1500, Rarity.UNCOMMON, true, true),
    DIAMOND_SWORD("Diamond Sword", 3000, Rarity.UNCOMMON, true, true),
    COMPACT_STONE_SWORD("Compact Stone Sword", 2000, Rarity.UNCOMMON, false, true),
    COMPACT_IRON_SWORD("Compact Iron Sword", 10000, Rarity.RARE, false, true),
    COMPACT_GOLD_SWORD("Compact Gold Sword", 50000, Rarity.RARE, false, true),
    COMPACT_DIAMOND_SWORD("Compact Diamond Sword", 200000, Rarity.EPIC, false, true),
    PERFECT_GOLD_SWORD("Perfect Gold Sword", 500000, Rarity.EPIC, false, true),
    PERFECT_DIAMOND_SWORD("Perfect Diamond Sword", 1000000, Rarity.LEGENDARY, false, true),
    OLD_PERFECT_SWORD("Old Perfect Sword", 6000000, Rarity.LEGENDARY, false, true),
    STRONG_PERFECT_SWORD("Strong Perfect Sword", 8000000, Rarity.LEGENDARY, false, true),
    WISE_PERFECT_SWORD("Wise Perfect Sword", 10000000, Rarity.LEGENDARY, false, true),
    LEGENDARY_PERFECT_SWORD("Legendary Perfect Sword", 12000000, Rarity.LEGENDARY, false, true),
    SUPERIOR_PERFECT_SWORD("Superior Perfect Sword", 20000000, Rarity.LEGENDARY, false, true);

    private final String name;
    private final int cost;
    private final Rarity rarity;
    private final boolean purchaseable;
    private final boolean craftable;

    Item(String name, int cost, Rarity rarity, boolean purchaseable, boolean craftable)
    {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
        this.purchaseable = purchaseable;
        this.craftable = craftable;
    }

    public String getName()
    {
        return name;
    }

    public int getCost()
    {
        return cost;
    }

    public Rarity getRarity()
    {
        return rarity;
    }

    public boolean isPurchaseable()
    {
        return purchaseable;
    }

    public boolean isCraftable()
    {
        return craftable;
    }
}