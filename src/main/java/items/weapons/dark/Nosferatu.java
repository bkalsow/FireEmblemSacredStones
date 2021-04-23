package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;

public class Nosferatu extends Weapon implements Dark
{
    private final static int maxUses = 20;
    private final static int weight = 14;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 3200;

    public Nosferatu()
    {
        super(maxUses, cost, "Drains enemy HP inco caster", "D", 1, 2,
            weight, might, hitChance, critChance, 1,
            "Recovers user's HP equal to damage dealt.");
        setName("Nosferatu");
    }
}
