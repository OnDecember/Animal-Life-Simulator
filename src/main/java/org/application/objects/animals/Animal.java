package org.application.objects.animals;

import lombok.Getter;
import lombok.val;
import org.application.enums.AnimalType;
import org.application.enums.Direction;
import org.application.interfaces.objects.Dying;
import org.application.interfaces.objects.Eatable;
import org.application.util.AnimalUtility;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Getter
public abstract class Animal implements Runnable, Dying {

    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    private final double weight;
    private final double maxCountOnCell;
    private final double speed;
    private final double satiatingFood;
    private final AnimalType animalType;
    private final boolean isMale;

    private Direction direction;
    private boolean isAlive = true;
    private double saturation;

    private final Map<Class<? extends Eatable>, Integer> chances;

    public Animal(double weight, double maxCountOnCell, double speed, double satiatingFood, AnimalType animalType) {
        this.weight = weight;
        this.maxCountOnCell = maxCountOnCell;
        this.speed = speed;
        this.satiatingFood = satiatingFood;
        this.animalType = animalType;
        this.chances = AnimalUtility.animalChances(animalType);
        this.isMale = defineGender();
        this.saturation = satiatingFood * 0.75;
    }

    @Override
    public void run() {

    }

    public void setSaturation(double value) {
        this.saturation = value;
    }

    public void eat(Eatable food) {
        Class<? extends Eatable> clazz = food.getClass();
        int chanceToEat = chances.get(clazz);
        boolean isAte = random.nextInt(100) + 1 <= chanceToEat;
        if (isAte && food instanceof Dying dying) {
            dying.die();
        }
    }

    public void move(Direction direction) {
        this.direction = direction;
    }

    public abstract Animal multiply();

    public void die() {
        this.isAlive = false;
    }

    private boolean defineGender() {
        return random.nextInt(2) == 1;
    }
}



