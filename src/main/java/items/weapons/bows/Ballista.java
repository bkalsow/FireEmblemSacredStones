package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;

public class Ballista extends Weapon implements Bow
{
    private final static int maxUses = 5;
    private final static int weight = 20;
    private final static int might = 8;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Ballista()
    {
        super(maxUses, cost, "", "E", 3, 10,
            weight, might, hitChance, critChance,
            4, "Archers/Snipers/Fleet only");
        setName("Ballista");
    }
}
