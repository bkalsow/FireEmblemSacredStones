package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class JunaFruit extends Item
{
    public JunaFruit()
    {
        super();
        setName("Juna Fruit");
        setPrice(Integer.MAX_VALUE);
        setUses(1);
        setDescription("Permanently lowers the user's level by 1-5 points. Can only be used by units level 9 or over.");

    }
}
