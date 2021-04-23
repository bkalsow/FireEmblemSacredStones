package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class Axereaver extends Weapon implements Lance
{
    private final static int maxUses = 15;
    private final static int weight = 11;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 5;
    private final static int cost = 1950;

    public Axereaver()
    {
        super(maxUses, cost, "Strong against axes.",
            "C", 1, 1, weight, might, hitChance,
            critChance, 2,
            "Advantage vs. Axes. Weak vs Swords.");
        setName("Axereaver");
    }
}
