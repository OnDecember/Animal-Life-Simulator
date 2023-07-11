package org.example.objects.animals.predators;

import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;

public class Fox extends Animal implements Predator {

    public Fox() {
        super(8, 30, 2, 2);
    }
}
