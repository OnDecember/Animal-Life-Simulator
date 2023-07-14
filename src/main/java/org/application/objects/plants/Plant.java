package org.application.objects.plants;

import lombok.*;
import org.application.interfaces.objects.Dying;
import org.application.interfaces.objects.Eatable;


@Getter
public abstract class Plant implements Eatable, Dying {

    protected double weight;
    protected double maxCountOnCell;
    private boolean isAlive = true;

    public Plant(double weight, double maxCountOnCell) {
        this.weight = weight;
        this.maxCountOnCell = maxCountOnCell;
    }

    public void die() {
        this.isAlive = false;
    }
}
