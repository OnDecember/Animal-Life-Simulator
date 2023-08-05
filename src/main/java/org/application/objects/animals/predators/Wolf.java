package org.application.objects.animals.predators;

import lombok.ToString;
import org.application.annotations.FilePath;
import org.application.objects.animals.Predator;
import org.application.config.database.Record;

@ToString
@FilePath(filePath = "wolf.yaml")
public class Wolf extends Predator {

    private final Record record;

    public Wolf(Record record) {
        super(record);
        this.record = record;
    }

    @Override
    public Wolf multiply() {
        return new Wolf(record);
    }
}
