package org.application.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.application.config.database.Record;
import org.application.enums.ObjectType;
import org.application.interfaces.Reproducible;

@Getter
@Setter
@ToString
public abstract class Organism implements Reproducible {

    private double weight;
    private int maxCountOnCell;
    private ObjectType objectType;
    private int chanceToReproduce;

    private boolean canReproduce = true;

    public Organism(Record record) {
        weight = record.getWeight();
        maxCountOnCell = record.getMaxCountOnCell();
        objectType = record.getObjectType();
        chanceToReproduce = record.getChanceToReproduce();
    }

    public abstract Organism multiply();

}
