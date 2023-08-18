package org.application.objects.animals.herbivorous;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

@Config(filePath = "animals/horse.yaml")
public class Horse extends Herbivorous {

    private final Record record;

    public Horse(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Horse multiply() {
        Console.logBornOrganism(this.getClass());
        return new Horse(record);
    }
}