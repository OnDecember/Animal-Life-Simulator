package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Caterpillar extends Animal implements Herbivorous {
    public Caterpillar() {
        super(0.01, 1000, 0, 0);
    }
}
