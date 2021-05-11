package main.java.items.consumables.classchange;

import java.util.ArrayList;
import main.java.characters.unitclasses.UnitClass;

public class HeroCrest extends classChanger
{
    public HeroCrest()
    {
        super("For mercenaries, myrmidons and fighters lv. 10 and up");

        ArrayList<UnitClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Hero Crest");
    }
}
