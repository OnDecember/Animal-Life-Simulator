package org.application.objects.plants;

import lombok.ToString;
import org.application.annotations.FilePath;
import org.application.objects.Organism;
import org.application.config.database.Record;

@ToString
@FilePath(filePath = "grass.yaml")
public class Grass extends Plant {

    public Grass(Record record) {
        super(record);
    }

    @Override
    public Organism multiply() {
        return null;
    }
}
