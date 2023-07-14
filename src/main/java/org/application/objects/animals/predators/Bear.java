package org.application.objects.animals.predators;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Predator;
import org.application.objects.animals.Animal;


public class Bear extends Animal implements Predator {

    public Bear() {
        super(500, 5, 2, 2, AnimalType.Bear);
    }

    @Override
    public Bear multiply() {
        return new Bear();
    }
}
