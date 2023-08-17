package org.application.objects.animals.herbivorous;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

@Config(filePath = "animals/boar.yaml")
public class Boar extends Herbivorous {

    private final Record record;

    public Boar(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Boar multiply() {
        Console.logBornOrganism(this.getClass());
        return new Boar(record);
    }
}