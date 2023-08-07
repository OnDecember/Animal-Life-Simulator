package org.application.island;

import lombok.*;
import org.application.config.database.Record;
import org.application.config.factory.Factory;
import org.application.objects.Organism;

import java.util.*;

@Getter
@Setter
public class Location {

    private final Factory factory = new Factory();
    private final Map<Class<? extends Organism>, Set<Organism>> objects = new HashMap<>();


    public void fillLocation(Class<? extends Organism> value, Record record, int maxCountOnCell) {
        Set<Organism> set = new HashSet<>();
        for (int i = 0; i < maxCountOnCell; i++) {
            set.add(factory.create(value, record));
        }
        objects.put(value, set);
    }

    public int countOfAnimals(int maxCountOnCell) {
        Random random = new Random();
        return random.nextInt(maxCountOnCell + 1);
    }
}
