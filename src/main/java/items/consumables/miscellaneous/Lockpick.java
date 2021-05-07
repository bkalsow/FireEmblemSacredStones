package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class Lockpick extends Item
{
    public Lockpick()
    {
        super();
        setName("Lockpick");
        setUses(15);
        setPrice(1200);
        setDescription("Opens chests and doors. Thieves, Assassins, and Rogues only.");
    }
}
