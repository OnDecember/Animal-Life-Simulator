package org.application.config.factory;

import org.application.config.database.DataBase;
import org.application.config.database.Record;
import org.application.enums.ObjectType;
import org.application.objects.Organism;
import org.application.objects.animals.herbivorous.Rabbit;
import org.application.objects.animals.predators.Wolf;
import org.application.objects.plants.Grass;

import java.util.HashSet;
import java.util.Set;

public class Factory {

    private final DataBase dataBase = DataBase.getInstance();

    public Organism create(ObjectType objectType) {
        Record record = dataBase.getDataBase().get(objectType);
        return switch (objectType) {
            case Wolf -> new Wolf(record);
            case Rabbit -> new Rabbit(record);
            case Grass -> new Grass(record);
        };
    }

    public Set<Organism> create(ObjectType... eatable) {
        Set<Organism> animals = new HashSet<>();
        for (ObjectType objectType : eatable) {
            animals.add(create(objectType));
        }
        return animals;
    }
}