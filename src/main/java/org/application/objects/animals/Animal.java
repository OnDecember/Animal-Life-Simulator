package org.application.objects.animals;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.application.enums.Direction;
import org.application.enums.ObjectType;
import org.application.objects.Organism;
import org.application.config.database.Record;

@Getter
@Setter
@ToString
public abstract class Animal extends Organism {

    private double speed;
    private double maxSatiatingFood;
    private ObjectType objectType;

    private Direction direction;
    private boolean isAlive = true;
    private double saturation;

    public Animal(Record record) {
        super(record);
        this.speed = record.getSpeed();
        this.maxSatiatingFood = record.getMaxSatiatingFood();
        this.objectType = record.getAnimalType();
        this.saturation = maxSatiatingFood * 0.6;
    }

    public void move(Direction direction) {
        this.direction = direction;
    }

    @Override
    public abstract Animal multiply();

    @Override
    public void die() {
        this.isAlive = false;
    }
}



