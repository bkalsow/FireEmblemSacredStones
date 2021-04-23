package main.java.items.weapons.anima;

import main.java.items.weapons.Weapon;

public class Alacalibur extends Weapon implements Anima
{
    private final static int maxUses = 20;
    private final static int weight = 2;
    private final static int might = 8;
    private final static int hitChance = 85;
    private final static int critChance = 0;
    private final static int cost = 1100;

    public Alacalibur()
    {
        super(maxUses, cost, "A Sacred Twin tome. Spd +5.",
            "B", 1, 2, weight, might, hitChance, critChance, 1,
            "Effective vs. Monsters. Cannot obtain normally.");
        setName("Alacalibur");
    }
}
