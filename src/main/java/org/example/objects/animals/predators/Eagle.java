package org.example.objects.animals.predators;

import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;

public class Eagle extends Animal implements Predator {

    public Eagle() {
        super(6, 20, 3, 1);
    }
}
