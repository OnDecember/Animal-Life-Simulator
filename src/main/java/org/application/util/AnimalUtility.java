package org.application.util;

import org.application.enums.AnimalType;
import org.application.interfaces.objects.Eatable;
import org.application.objects.animals.Animal;
import org.application.objects.animals.herbivorous.*;
import org.application.objects.animals.predators.*;
import org.application.objects.plants.Grass;

import java.util.HashMap;
import java.util.Map;

public class AnimalUtility {


    private AnimalUtility(){}


    public static Map<Class<? extends Eatable>, Integer> animalChances(AnimalType animalType) {
        return switch (animalType) {
            case Boar -> boarChances();
            case Buffalo -> buffaloChances();
            case Caterpillar -> caterpillarChances();
            case Deer -> deerChances();
            case Duck -> duckChances();
            case Goat -> goatChances();
            case Horse -> horseChances();
            case Mouse -> mouseChances();
            case Rabbit -> rabbitChances();
            case Sheep -> sheepChances();
            case Bear -> bearChances();
            case Boa -> boaChances();
            case Eagle -> eagleChances();
            case Fox -> foxChances();
            case Wolf -> wolfChances();
        };
    }

    private static Map<Class<? extends Eatable>, Integer> boarChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 50);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 90);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> buffaloChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> caterpillarChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> deerChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> duckChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Caterpillar.class, 90);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> goatChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> horseChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> mouseChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 90);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> rabbitChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
            put(Grass.class, 100);
        }};

    }

    private static Map<Class<? extends Eatable>, Integer> sheepChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
            put(Grass.class, 100);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> bearChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 80);
            put(Fox.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 40);
            put(Deer.class, 80);
            put(Rabbit.class, 80);
            put(Mouse.class, 90);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 80);
            put(Caterpillar.class, 0);
            put(Grass.class, 0);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> boaChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Fox.class, 15);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 20);
            put(Mouse.class, 40);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 10);
            put(Caterpillar.class, 0);
            put(Grass.class, 0);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> eagleChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Fox.class, 10);
            put(Bear.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 90);
            put(Mouse.class, 90);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 80);
            put(Caterpillar.class, 0);
            put(Grass.class, 0);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> foxChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0);
            put(Boa.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 70);
            put(Mouse.class, 90);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 60);
            put(Caterpillar.class, 40);
            put(Grass.class, 0);
        }};
    }

    private static Map<Class<? extends Eatable>, Integer> wolfChances() {
        return new HashMap<>() {{
            put(Boa.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 10);
            put(Deer.class, 15);
            put(Rabbit.class, 60);
            put(Mouse.class, 80);
            put(Goat.class, 60);
            put(Sheep.class, 70);
            put(Boar.class, 15);
            put(Buffalo.class, 10);
            put(Duck.class, 40);
            put(Caterpillar.class, 0);
            put(Grass.class, 0);
        }};
    }
}




