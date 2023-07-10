package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Sheep extends Animal implements Herbivorous {

    public Sheep() {
        super(70, 140, 3, 10);
    }
}
