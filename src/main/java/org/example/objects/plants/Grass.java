package org.example.objects.plants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Grass extends Plant {

    public Grass() {
        super(1, 200, 0, 0);
    }
}
