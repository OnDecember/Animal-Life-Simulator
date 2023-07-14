package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;


public class Mouse extends Animal implements Herbivorous {

    public Mouse() {
        super(0.05, 500, 1, 0.01, AnimalType.Mouse);
    }

    @Override
    public Mouse multiply() {
        return new Mouse();
    }
}
