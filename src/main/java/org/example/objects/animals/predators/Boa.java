package org.example.objects.animals.predators;

import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;


public class Boa extends Animal implements Predator {

    public Boa() {
        super(15, 30, 3, 8);
    }
}
