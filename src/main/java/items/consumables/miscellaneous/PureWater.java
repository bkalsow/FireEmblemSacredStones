package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class PureWater extends Item
{
    public PureWater()
    {
        super();
        setName("Pure Water");
        setPrice(900);
        setUses(3);
        setDescription("A draught that boosts Res. Grows weaker each turn.");

    }
}
