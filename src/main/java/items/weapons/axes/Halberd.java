package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;

public class Halberd extends Weapon implements Axe
{
    private final static int maxUses = 18;
    private final static int weight = 15;
    private final static int might = 10;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 810;

    public Halberd()
    {
        super(maxUses, cost, "Effective against cavalry", "D",
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective vs. Cavalry units.");
        setName("Halberd");
    }
}
