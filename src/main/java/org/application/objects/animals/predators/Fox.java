package org.application.objects.animals.predators;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Predator;
import org.application.config.database.Record;

@Config(filePath = "animals/fox.yaml")
public class Fox extends Predator {

    private final Record record;

    public Fox(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Fox multiply() {
        Console.logBornOrganism(this.getClass());
        return new Fox(record);
    }
}