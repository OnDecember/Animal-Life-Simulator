package org.application.objects.animals.herbivorous;

import lombok.ToString;
import org.application.annotations.Config;
import org.application.objects.animals.Herbivorous;
import org.application.config.database.Record;

@ToString
@Config(filePath = "animals/rabbit.yaml")
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
