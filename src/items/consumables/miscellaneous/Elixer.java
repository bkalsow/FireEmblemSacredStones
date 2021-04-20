package items.consumables.miscellaneous;

import items.Item;

/**
 * This class represents an Elixer.
 * @author Brandan Kalsow
 * @version 1.0
 */
public class Elixer extends Item
{
    public Elixer()
    {
        super();
        setName("Elixer");
        setPrice(3000);
        setUses(3);
        setDescription("Restores all HP when used");
    }

    public Elixer(int remainingUses)
    {
        super();
        setName("Elixer");
        setPrice(3000);
        setUses(remainingUses);
        setDescription("Restores all HP when used");
    }

    
}
