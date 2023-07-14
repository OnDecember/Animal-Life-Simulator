package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;

public class Duck extends Animal implements Herbivorous {

    public Duck() {
        super(1, 200, 4, 0.15, AnimalType.Duck);
    }

    @Override
    public Duck multiply() {
        return new Duck();
    }
}
