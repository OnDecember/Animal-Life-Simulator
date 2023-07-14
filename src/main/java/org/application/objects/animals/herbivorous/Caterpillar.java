package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;

public class Caterpillar extends Animal implements Herbivorous {

    public Caterpillar() {
        super(0.01, 1000, 0, 0, AnimalType.Caterpillar);
    }

    @Override
    public Caterpillar multiply() {
        return new Caterpillar();
    }
}
