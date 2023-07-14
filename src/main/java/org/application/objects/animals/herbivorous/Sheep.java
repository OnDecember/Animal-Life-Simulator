package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;


public class Sheep extends Animal implements Herbivorous {

    public Sheep() {
        super(70, 140, 3, 10, AnimalType.Sheep);
    }

    @Override
    public Sheep multiply() {
        return new Sheep();
    }
}
