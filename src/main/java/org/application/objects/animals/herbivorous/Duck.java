package org.application.objects.animals.herbivorous;

import org.application.annotations.Config;
import org.application.console.Console;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

@Config(filePath = "animals/duck.yaml")
public class Duck extends Herbivorous {

    private final Record record;

    public Duck(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Duck multiply() {
        Console.logBornOrganism(this.getClass());
        return new Duck(record);
    }
}