package org.example.objects.animals.predators;

import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;
import org.example.objects.plants.Grass;

import java.util.HashMap;

public class Wolf extends Animal implements Predator {

    static  {

    }
    public Wolf() {
        super(50, 30, 3, 8);
    }
}
