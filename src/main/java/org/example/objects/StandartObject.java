package org.example.objects;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public abstract class StandartObject {

    private double weight;
    private double maxCountOnCell;
    private double speed;
    private double satiatingFood;

    public StandartObject(double weight, double maxCountOnCell, double speed, double satiatingFood) {
        this.weight = weight;
        this.maxCountOnCell = maxCountOnCell;
        this.speed = speed;
        this.satiatingFood = satiatingFood;
    }
}
