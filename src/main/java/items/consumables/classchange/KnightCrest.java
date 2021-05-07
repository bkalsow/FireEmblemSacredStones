package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class KnightCrest extends classChanger
{
    public KnightCrest()
    {
        super("For cavaliers and knights lv. 10 and up");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Knight Crest");
    }
}
