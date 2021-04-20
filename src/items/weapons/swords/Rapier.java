package items.weapons.swords;

import items.weapons.Weapon;

public class Rapier extends Weapon implements Sword
{    
    private final static int maxUses = 50;
    private final static int weight = 5;
    private final static int might = 7;
    private final static int hitChance = 95;
    private final static int critChance = 10;
    private final static int cost = 0;

    public Rapier()
    {
        super(maxUses, cost, "Effective against infantry.", "Prf",
            1, 1, weight, might, hitChance, critChance, 2,
            "Eirika Only. Effective vs. Armored and Cavalry units.");
    }
}
