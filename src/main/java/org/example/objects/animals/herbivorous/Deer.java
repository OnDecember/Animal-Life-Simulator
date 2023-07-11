package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

public class Deer extends Animal implements Herbivorous {

    public Deer() {
        super(300, 20, 4, 50);
    }
}
