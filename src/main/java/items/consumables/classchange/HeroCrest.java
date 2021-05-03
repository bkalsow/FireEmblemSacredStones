package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class HeroCrest extends classChanger
{
    public HeroCrest()
    {
        super("For mercenaries, myrmidons and fighters level 10 and up");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
    }
}
