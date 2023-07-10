package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Rabbit extends Animal implements Herbivorous {

    public Rabbit() {
        super(2, 150, 2, 0.45);
    }
}
