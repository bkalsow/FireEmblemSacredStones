package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;

public class Longbow extends Weapon implements Bow
{
    private final static int maxUses = 20;
    private final static int weight = 10;
    private final static int might = 5;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 2000;

    public Longbow()
    {
        super(maxUses, cost, "Extended attack range.", "E", 2, 3,
            weight, might, hitChance, critChance,
            1, "");
        setName("Longbow");
    }
}
