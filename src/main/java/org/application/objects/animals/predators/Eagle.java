package org.application.objects.animals.predators;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Predator;
import org.application.objects.animals.Animal;

public class Eagle extends Animal implements Predator {

    public Eagle() {
        super(6, 20, 3, 1, AnimalType.Eagle);
    }

    @Override
    public Eagle multiply() {
        return new Eagle();
    }
}
