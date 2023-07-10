package org.example.objects.animals.predators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Wolf extends Animal implements Predator {

    public Wolf() {
        super(50, 30, 3, 8);
    }
}
