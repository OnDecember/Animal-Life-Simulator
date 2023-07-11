package org.example.objects.animals;

import lombok.Getter;
import org.example.enums.Direction;
import org.example.interfaces.objects.Eatable;
import org.example.util.AnimalUtility;

import java.util.Map;

@Getter
public abstract class Animal implements Eatable {

    private final double weight;
    private final double maxCountOnCell;
    private final double speed;
    private final double satiatingFood;

    protected Map<Class<? extends Eatable>, Double> chances = AnimalUtility.animalChances(this.getClass());

    public Animal(double weight, double maxCountOnCell, double speed, double satiatingFood) {
        this.weight = weight;
        this.maxCountOnCell = maxCountOnCell;
        this.speed = speed;
        this.satiatingFood = satiatingFood;
    }

    public void eat(Eatable food) {}

    public void move(Direction direction) {}

    public void multiply() {}

    public void die() {}
}



