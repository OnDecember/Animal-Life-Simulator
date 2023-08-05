package org.application.config.database;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.application.enums.ObjectType;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Record {

    private double weight;
    private int maxCountOnCell;
    private int speed;
    private double maxSatiatingFood;
    private ObjectType animalType;
    private double saturation;

}
