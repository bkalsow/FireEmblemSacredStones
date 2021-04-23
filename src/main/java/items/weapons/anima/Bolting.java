package main.java.items.weapons.anima;

import main.java.items.weapons.Weapon;

public class Bolting extends Weapon implements Anima
{
    private final static int maxUses = 5;
    private final static int weight = 20;
    private final static int might = 12;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 2500;

    public Bolting()
    {
        super(maxUses, cost, "Long-range lightning strike.",
            "E", 3, 10, weight, might, hitChance, critChance, 5,
            "");
        setName("Bolting");
    }
}
