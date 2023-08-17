package org.application.objects.plants;

import lombok.*;
import org.application.objects.Organism;
import org.application.config.database.Record;

@ToString
@Getter
public abstract class Plant extends Organism {

    public Plant(Record record) {
        super(record);
    }
}

