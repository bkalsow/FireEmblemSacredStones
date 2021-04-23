package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;

public class Wyrmslayer extends Weapon implements Sword
{
    private final static int maxUses = 30;
    private final static int weight = 5;
    private final static int might = 8;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 4500;

    public Wyrmslayer()
    {
        super(maxUses, cost, "Effective against wyverns.", "C",
            1, 1, weight, might, hitChance, critChance, 1, "Effective vs. Dragon units.");
    }
}
