package org.application.objects.animals.predators;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Predator;
import org.application.config.database.Record;

//@Config(filePath = "animals/rabbit.yaml")
public class Bear extends Predator {

    private final Record record;

    public Bear(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Bear multiply() {
        Console.logBornOrganism(this.getClass());
        return new Bear(record);
    }
}