package org.example.objects.animals.herbivorous;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.interfaces.animals.Herbivorous;
import org.example.objects.animals.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
public class Deer extends Animal implements Herbivorous {

    public Deer() {
        super(300, 20, 4, 50);
    }
}
