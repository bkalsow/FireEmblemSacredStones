package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class Torch extends Item
{
    public Torch()
    {
        super();
        setName("Torch");
        setPrice(500);
        setUses(5);
        setDescription("A staff with burning pitch. Grows dimmer each turn.");
    }
}
