package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;

public class Garm extends Weapon implements Axe
{
    private final static int maxUses = 30;
    private final static int weight = 13;
    private final static int might = 20;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Garm()
    {
        super(maxUses, cost, "The Sacred Twin black axe. Spd +5", "S",
            1, 1, weight, might, hitChance, critChance, 1,
            "+5 Speed bonus to wielder while equipped. Effective vs. Monsters.");
        setName("Garm");
    }
}
