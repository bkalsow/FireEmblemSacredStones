package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class SilverCard extends Item
{
    public SilverCard()
    {
        super();
        setName("Silver Card");
        setDescription("A special card that reduces the cost of all items by half.");
        setPrice(4000);
        setUses(1);
    }
}
