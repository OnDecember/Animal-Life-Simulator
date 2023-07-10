package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Buffalo extends Animal implements Herbivorous {
    public Buffalo() {
        super(700, 10, 3, 100);
    }
}
