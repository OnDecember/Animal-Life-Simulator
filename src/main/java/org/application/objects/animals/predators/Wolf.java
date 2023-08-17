package org.application.objects.animals.predators;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Predator;
import org.application.config.database.Record;

@Config(filePath = "animals/wolf.yaml")
public class Wolf extends Predator {

    private final Record record;

    public Wolf(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Wolf multiply() {
        Console.logBornOrganism(this.getClass());
        return new Wolf(record);
    }
}