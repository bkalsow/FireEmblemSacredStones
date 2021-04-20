package items.weapons.axes;

import items.weapons.Weapon;

public class Swordreaver extends Weapon implements Axe
{
    private final static int maxUses = 15;
    private final static int weight = 13;
    private final static int might = 11;
    private final static int hitChance = 65;
    private final static int critChance = 5;
    private final static int cost = 2100;

    public Swordreaver()
    {
        super(maxUses, cost, "Strong against swords.", "C",
            1, 1, weight, might, hitChance, critChance, 2,
            "Advantage vs. Swords. Disadvantage vs. Lances.");
            setName("Swordreaver");
    }
}
