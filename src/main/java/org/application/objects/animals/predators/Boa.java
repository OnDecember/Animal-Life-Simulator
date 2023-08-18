package org.application.objects.animals.predators;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Predator;
import org.application.config.database.Record;

@Config(filePath = "animals/boa.yaml")
public class Boa extends Predator {

    private final Record record;

    public Boa(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Boa multiply() {
        Console.logBornOrganism(this.getClass());
        return new Boa(record);
    }
}