package org.example.objects.animals;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.objects.StandartObject;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public abstract class Animal extends StandartObject {

    private Map<? extends Animal, Double> chances;

    public Animal(double weight, double maxCountOnCell, double speed, double satiatingFood) {
        super(weight, maxCountOnCell, speed, satiatingFood);
    }
}



