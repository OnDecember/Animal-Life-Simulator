package org.application.objects.animals;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.application.config.database.Record;
import org.application.enums.Direction;
import org.application.enums.ObjectType;
import org.application.interfaces.Movable;
import org.application.interfaces.Reproducible;
import org.application.objects.Organism;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Getter
@Setter
@ToString
public abstract class Animal extends Organism implements Movable, Reproducible {

    ThreadLocalRandom random = ThreadLocalRandom.current();

    private int speed;
    private double maxSatiatingFood;
    private double saturation;
    private int maxChild;

    private boolean canMove = true;

    private Map<ObjectType, Integer> targetMatrix;
    public Animal(Record record) {
        super(record);
        this.speed = record.getSpeed();
        this.maxSatiatingFood = record.getMaxSatiatingFood();
        this.saturation = maxSatiatingFood * 0.75;
        this.targetMatrix = record.getTargetMatrix();
        this.maxChild = record.getMaxChild();
    }

    @Override
    public Direction[] move() {
        int countSteps = random.nextInt(speed + 1);
        Direction[] steps = new Direction[countSteps];
        Direction[] directions = Direction.values();
        for (int i = 0; i < countSteps; i++) {
            steps[i] = directions[random.nextInt(directions.length)];
        }
        return steps;
    }
}



