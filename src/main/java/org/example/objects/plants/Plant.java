package org.example.objects.plants;

import lombok.*;
import org.example.interfaces.objects.Eatable;


@Getter
public abstract class Plant implements Eatable {

    protected double weight;
    protected double maxCountOnCell;

    public Plant(double weight, double maxCountOnCell) {
        this.weight = weight;
        this.maxCountOnCell = maxCountOnCell;
    }
}
