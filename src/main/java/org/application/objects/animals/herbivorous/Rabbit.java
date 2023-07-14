package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;

public class Rabbit extends Animal implements Herbivorous {

    public Rabbit() {
        super(2, 150, 2, 0.45, AnimalType.Rabbit);
    }

    @Override
    public Rabbit multiply() {
        return new Rabbit();
    }
}
