package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;

public class Hammer extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 15;
    private final static int might = 10;
    private final static int hitChance = 55;
    private final static int critChance = 0;
    private final static int cost = 800;

    public Hammer()
    {
        super(maxUses, cost, "Effective against Knights.", "D",
            1, 1, weight, might, hitChance, critChance, 2,
            "Effective against Armored units.");
        setName("Hammer");
    }
}
