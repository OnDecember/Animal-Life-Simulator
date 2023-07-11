package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

public class Caterpillar extends Animal implements Herbivorous {
    public Caterpillar() {
        super(0.01, 1000, 0, 0);
    }
}
