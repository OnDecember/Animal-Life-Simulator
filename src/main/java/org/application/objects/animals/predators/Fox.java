package org.application.objects.animals.predators;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Predator;
import org.application.objects.animals.Animal;

public class Fox extends Animal implements Predator {

    public Fox() {
        super(8, 30, 2, 2, AnimalType.Fox);
    }

    @Override
    public Fox multiply() {
        return new Fox();
    }
}
