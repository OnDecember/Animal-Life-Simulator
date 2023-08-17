package org.application.objects.animals.herbivorous;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

//@Config(filePath = "animals/rabbit.yaml")
public class Caterpillar extends Herbivorous {

    private final Record record;

    public Caterpillar(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Caterpillar multiply() {
        Console.logBornOrganism(this.getClass());
        return new Caterpillar(record);
    }
}