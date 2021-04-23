package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;

public class BattleAxe extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 15;
    private final static int might = 13;
    private final static int hitChance = 60;
    private final static int critChance = 5;
    private final static int cost = 1000;

    public BattleAxe()
    {
        super(maxUses, cost, "Strong, but difficult to wield.",
            "B", 1, 1, weight, might, hitChance, critChance, 1,
            "");
        setName("Battle Axe");
    }
}
