package main.java.items.consumables.classchange;

import java.util.ArrayList;
import main.java.characters.unitclasses.UnitClass;

public class GuidingRing extends classChanger
{
    public GuidingRing()
    {
        super("For mages, shamans, priests, clerics, monks and troubadors lv. 10 and up");

        ArrayList<UnitClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Guiding Ring");
    }
}
