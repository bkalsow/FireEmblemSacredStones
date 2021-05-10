package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class OceanSeal extends classChanger
{
    public OceanSeal()
    {
        super("For thieves and pirates lv. 10 and up");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Ocean Seal");
    }
}
