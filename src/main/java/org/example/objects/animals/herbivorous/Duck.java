package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

public class Duck extends Animal implements Herbivorous {

    public Duck() {
        super(1, 200, 4, 0.15);
    }
}
