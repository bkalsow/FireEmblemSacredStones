package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class ElysianWhip extends classChanger
{
    public ElysianWhip()
    {
        super("For pegasus knights and wyvern riders lv. 10 and up");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Elysian Whip");
    }
}
