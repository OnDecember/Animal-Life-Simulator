package org.application.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.application.config.database.Record;

@Getter
@Setter
@ToString
public abstract class Organism {

    private double weight;
    private int maxCountOnCell;

    public Organism(Record record) {
        weight = record.getWeight();
        maxCountOnCell = record.getMaxCountOnCell();
    }

    public abstract void die();

    public abstract Organism multiply();
}
