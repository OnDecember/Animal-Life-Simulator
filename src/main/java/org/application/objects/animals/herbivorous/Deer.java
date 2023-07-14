package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;

public class Deer extends Animal implements Herbivorous {

    public Deer() {
        super(300, 20, 4, 50, AnimalType.Deer);
    }

    @Override
    public Deer multiply() {
        return new Deer();
    }
}
