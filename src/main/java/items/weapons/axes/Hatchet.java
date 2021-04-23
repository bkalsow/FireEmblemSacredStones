package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;

public class Hatchet extends Weapon implements Axe
{
    private final static int maxUses = 50;
    private final static int weight = 5;
    private final static int might = 4;
    private final static int hitChance = 85;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Hatchet()
    {
        super(maxUses, cost, "Lightweight and easy to hit with.",
            "E", 1, 1, weight, might, hitChance, critChance, 1,
            "");
        setName("Hatchet");
    }
}
