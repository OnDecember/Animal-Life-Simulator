package org.application.objects.animals;

import org.application.config.database.Record;


public abstract class Predator extends Animal {

    public Predator(Record record) {
        super(record);
    }
}
