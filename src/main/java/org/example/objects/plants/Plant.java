package org.example.objects.plants;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.objects.StandartObject;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public abstract class Plant extends StandartObject {

    public Plant(double weight, double maxCountOnCell, double speed, double satiatingFood) {
        super(weight, maxCountOnCell, speed, satiatingFood);
    }
}
