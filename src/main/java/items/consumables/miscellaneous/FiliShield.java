package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class FiliShield extends Item
{
    public FiliShield()
    {
        super();
        setName("Fili Shield");
        setDescription("An amulet that protects filers from arrows.");
        setPrice(10000);
        setInfiniteUses(true);
        setUses(Integer.MAX_VALUE);
    }
}
