package org.application.objects.animals.herbivorous;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

@Config(filePath = "animals/buffalo.yaml")
public class Buffalo extends Herbivorous {

    private final Record record;

    public Buffalo(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Buffalo multiply() {
        Console.logBornOrganism(this.getClass());
        return new Buffalo(record);
    }
}