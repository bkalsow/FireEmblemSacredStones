package items.weapons.axes;

import items.weapons.Weapon;

public class Swordslayer extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 11;
    private final static int might = 13;
    private final static int hitChance = 80;
    private final static int critChance = 5;
    private final static int cost = 2000;

    public Swordslayer()
    {
        super(maxUses, cost, "", "C",
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective & Advantage vs Swords. Disadvantage vs Lances.");
        setName("Swordslayer");
    }
}
