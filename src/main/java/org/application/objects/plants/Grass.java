package org.application.objects.plants;

import lombok.ToString;
import org.application.annotations.Config;
import org.application.config.database.Record;

@ToString
@Config(filePath = "plants/grass.yaml")
public class Grass extends Plant {

    private final Record record;

    public Grass(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Grass multiply() {
        return new Grass(record);
    }
}
