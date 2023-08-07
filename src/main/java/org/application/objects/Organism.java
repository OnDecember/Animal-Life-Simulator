package org.application.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.application.config.database.Record;
import org.application.enums.ObjectType;

@Getter
@Setter
@ToString
public abstract class Organism {

    private double weight;
    private int maxCountOnCell;
    private ObjectType objectType;

    public Organism(Record record) {
        weight = record.getWeight();
        maxCountOnCell = record.getMaxCountOnCell();
        objectType = record.getObjectType();
    }

    public abstract void die();

    public abstract Organism multiply();
}
