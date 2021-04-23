package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class Reginleif extends Weapon implements Lance
{
    private final static int maxUses = 45;
    private final static int weight = 8;
    private final static int might = 10;
    private final static int hitChance = 80;
    private final static int critChance = 10;
    private final static int cost = 0;

    public Reginleif()
    {
        super(maxUses, cost, "", "Prf", 1, 1,
            weight, might, hitChance, critChance,
            2, "Ephraim Only. Effective vs Armored/Horesback units.");
        setName("Reginleif");
    }
}
