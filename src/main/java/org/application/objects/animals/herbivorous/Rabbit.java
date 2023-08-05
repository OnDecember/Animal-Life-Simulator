package org.application.objects.animals.herbivorous;

import lombok.ToString;
import org.application.annotations.FilePath;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

@ToString
@FilePath(filePath = "Rabbit.yaml")
public class Rabbit extends Herbivorous {

    private final Record record;

    public Rabbit(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Rabbit multiply() {
        return new Rabbit(record);
    }
}
