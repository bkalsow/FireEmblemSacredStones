package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class GoldGem extends Item
{
    public GoldGem()
    {
        super();
        setName("Gold Gem");
        setDescription("A valuable gemstone with 20,000 gold.");
        setPrice(40000);
        setUses(1);
    }
}
