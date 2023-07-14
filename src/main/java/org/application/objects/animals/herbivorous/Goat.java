package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;


public class Goat extends Animal implements Herbivorous {

    public Goat() {
        super(60, 140, 3, 10, AnimalType.Goat);
    }

    @Override
    public Goat multiply() {
        return new Goat();
    }
}
