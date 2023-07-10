package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Duck extends Animal implements Herbivorous {

    public Duck() {
        super(1, 200, 4, 0.15);
    }
}
