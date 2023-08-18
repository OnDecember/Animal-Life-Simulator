package org.application.objects.animals.predators;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Predator;
import org.application.config.database.Record;

@Config(filePath = "animals/eagle.yaml")
public class Eagle extends Predator {

    private final Record record;

    public Eagle(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Eagle multiply() {
        Console.logBornOrganism(this.getClass());
        return new Eagle(record);
    }
}