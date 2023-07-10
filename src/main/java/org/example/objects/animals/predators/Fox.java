package org.example.objects.animals.predators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Fox extends Animal implements Predator {

    public Fox() {
        super(8, 30, 2, 2);
    }
}
