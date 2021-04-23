package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class Spear extends Weapon implements Lance
{
    private final static int maxUses = 150;
    private final static int weight = 10;
    private final static int might = 12;
    private final static int hitChance = 70;
    private final static int critChance = 5;
    private final static int cost = 9000;

    public Spear()
    {
        super(maxUses, cost, "Doubles as ranged attack.", "E", 1, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Spear");
    }
}
