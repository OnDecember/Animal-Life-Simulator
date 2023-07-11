package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;


public class Sheep extends Animal implements Herbivorous {

    public Sheep() {
        super(70, 140, 3, 10);
    }
}
