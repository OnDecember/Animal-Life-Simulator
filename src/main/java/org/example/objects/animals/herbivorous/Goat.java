package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;


public class Goat extends Animal implements Herbivorous {

    public Goat() {
        super(60, 140, 3, 10);
    }
}
