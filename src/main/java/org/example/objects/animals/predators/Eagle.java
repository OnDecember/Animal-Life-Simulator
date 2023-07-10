package org.example.objects.animals.predators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Predator;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Eagle extends Animal implements Predator {

    public Eagle() {
        super(6, 20, 3, 1);
    }
}
