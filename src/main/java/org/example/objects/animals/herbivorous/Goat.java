package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Goat extends Animal implements Herbivorous {

    public Goat() {
        super(60, 140, 3, 10);
    }
}
