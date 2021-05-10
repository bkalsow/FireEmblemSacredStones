package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class MetisTome extends Item
{
    public MetisTome()
    {
        super();
        setName("Metis's Tome");
        setDescription("Improves a unit's maturity.");
        setPrice(Integer.MAX_VALUE);
        setUses(1);
    }
}
