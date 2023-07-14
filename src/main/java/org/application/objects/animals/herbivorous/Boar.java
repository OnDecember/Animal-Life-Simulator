package org.application.objects.animals.herbivorous;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Herbivorous;
import org.application.objects.animals.Animal;

public class Boar extends Animal implements Herbivorous {

    public Boar() {
        super(400, 50, 2, 50, AnimalType.Boar);
    }

    @Override
    public Boar multiply() {
        return new Boar();
    }
}
