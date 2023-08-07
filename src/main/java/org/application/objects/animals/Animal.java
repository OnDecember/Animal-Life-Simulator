package org.application.objects.animals;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.application.config.database.Record;
import org.application.enums.Direction;
import org.application.enums.ObjectType;
import org.application.objects.Organism;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public abstract class Animal extends Organism {

    private double speed;
    private double maxSatiatingFood;
    private double saturation;

    private Direction direction;
    private boolean isAlive = true;

    private Map<ObjectType, Integer> targetMatrix = new HashMap<>();
    public Animal(Record record) {
        super(record);
        this.speed = record.getSpeed();
        this.maxSatiatingFood = record.getMaxSatiatingFood();
        this.saturation = maxSatiatingFood * 0.6;
        this.targetMatrix = record.getTargetMatrix();
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



