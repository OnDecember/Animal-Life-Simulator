package org.example.objects.animals.predators;

import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;


public class Bear extends Animal implements Predator {

    public Bear() {
        super(500, 5, 2, 2);
    }
}
