package items.weapons.anima;

import items.weapons.Weapon;

public class Excalibur extends Weapon implements Anima
{
    private final static int maxUses = 30;
    private final static int weight = 13;
    private final static int might = 18;
    private final static int hitChance = 90;
    private final static int critChance = 10;
    private final static int cost = 0;

    public Excalibur()
    {
        super(maxUses, cost, "A Sacred Twin tome. Spd +5.",
            "S", 1, 2, weight, might, hitChance, critChance, 1,
            "Speed +5. Effective vs. Monsters.");
        setName("Excalibur");
    }
}
