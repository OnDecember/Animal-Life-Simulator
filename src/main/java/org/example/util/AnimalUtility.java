package org.example.util;

import org.example.enums.AnimalType;
import org.example.interfaces.objects.Eatable;
import org.example.objects.animals.Animal;
import org.example.objects.animals.herbivorous.*;
import org.example.objects.animals.predators.*;

import java.util.HashMap;
import java.util.Map;

public class AnimalUtility {

    private static final Map<Class<? extends Animal>, AnimalType> CONFORMITY = fillConformity();


    private static Map<Class<? extends Animal>, AnimalType> fillConformity() {
        return new HashMap<>() {{
            put(Boar.class, AnimalType.Boar);
            put(Buffalo.class, AnimalType.Buffalo);
            put(Caterpillar.class, AnimalType.Caterpillar);
            put(Deer.class, AnimalType.Deer);
            put(Duck.class, AnimalType.Duck);
            put(Goat.class, AnimalType.Goat);
            put(Horse.class, AnimalType.Horse);
            put(Mouse.class, AnimalType.Mouse);
            put(Rabbit.class, AnimalType.Rabbit);
            put(Sheep.class, AnimalType.Sheep);
            put(Bear.class, AnimalType.Bear);
            put(Boa.class, AnimalType.Boa);
            put(Eagle.class, AnimalType.Eagle);
            put(Fox.class, AnimalType.Fox);
            put(Wolf.class, AnimalType.Wolf);
        }};
    }

    public static Map<Class<? extends Eatable>, Double> animalChances(Class<? extends Animal> clazz) {
        return CONFORMITY.get(clazz).getChances();
    }
}




