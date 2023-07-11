package org.example.objects.animals.herbivorous;

import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;


public class Mouse extends Animal implements Herbivorous {

    public Mouse() {
        super(0.05, 500, 1, 0.01);
    }
}
