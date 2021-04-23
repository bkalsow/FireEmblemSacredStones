package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

/**
 * This class represents a Vulnerary.
 * @author Brandan Kalsow
 * @version 1.0
 */
public class Vulnerary extends Item
{
    public Vulnerary()
    {
        super();
        setName("Vulnerary");
        setPrice(300);
        setUses(3);
        setDescription("Restores 10 HP when used");
    }

    public Vulnerary(int remainingUses)
    {
        super();
        setName("Vulnerary");
        setPrice(300);
        setUses(remainingUses);
        setDescription("Restores 10 HP when used");
    }
}
