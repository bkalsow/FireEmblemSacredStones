package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class SolarBrace extends classChanger
{
    public SolarBrace()
    {
        super("For Ephraim");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Solar Brace");
    }
}
