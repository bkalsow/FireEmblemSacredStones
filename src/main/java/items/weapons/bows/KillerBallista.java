package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class KillerBallista extends Weapon implements Bow
{
    private final static int maxUses = 5;
    private final static int weight = 20;
    private final static int might = 12;
    private final static int hitChance = 65;
    private final static int critChance = 10;
    private final static int cost = 0;

    public KillerBallista()
    {
        super(maxUses, cost, "", WeaponRanks.E, 2, 2,
            weight, might, hitChance, critChance,
            1, "Archers/Snipers/Fleet only");
        setName("Killer Ballista");
    }
}
