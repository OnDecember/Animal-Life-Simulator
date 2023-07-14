package org.application.objects.animals.predators;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Predator;
import org.application.objects.animals.Animal;

public class Wolf extends Animal implements Predator {

    public Wolf() {
        super(50, 30, 3, 8, AnimalType.Wolf);
    }

    @Override
    public Wolf multiply() {
        return new Wolf();
    }
}
