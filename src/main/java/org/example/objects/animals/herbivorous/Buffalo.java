package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;


public class Buffalo extends Animal implements Herbivorous {
    public Buffalo() {
        super(700, 10, 3, 100);
    }
}
