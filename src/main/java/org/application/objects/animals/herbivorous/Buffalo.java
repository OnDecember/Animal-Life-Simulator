package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;


public class Buffalo extends Animal implements Herbivorous {
    public Buffalo() {
        super(700, 10, 3, 100, AnimalType.Buffalo);
    }

    @Override
    public Buffalo multiply() {
        return new Buffalo();
    }
}
