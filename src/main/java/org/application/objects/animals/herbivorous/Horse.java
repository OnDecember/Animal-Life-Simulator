package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;

public class Horse extends Animal implements Herbivorous {

    public Horse() {
        super(400, 20, 4, 60, AnimalType.Horse);
    }

    @Override
    public Horse multiply() {
        return new Horse();
    }
}
