package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

public class Horse extends Animal implements Herbivorous {

    public Horse() {
        super(400, 20, 4, 60);
    }
}
