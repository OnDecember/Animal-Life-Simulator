package org.application.objects.animals.predators;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Predator;
import org.application.objects.animals.Animal;


public class Boa extends Animal implements Predator {

    public Boa() {
        super(15, 30, 3, 8, AnimalType.Boa);
    }

    @Override
    public Boa multiply() {
        return new Boa();
    }
}
