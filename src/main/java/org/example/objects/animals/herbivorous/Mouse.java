package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Mouse extends Animal implements Herbivorous {

    public Mouse() {
        super(0.05, 500, 1, 0.01);
    }
}
