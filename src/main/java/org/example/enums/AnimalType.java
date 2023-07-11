package org.example.enums;

import org.example.interfaces.objects.Eatable;
import org.example.objects.animals.herbivorous.*;
import org.example.objects.animals.predators.*;
import org.example.objects.plants.Grass;

import java.util.HashMap;
import java.util.Map;

public enum AnimalType {
    Boar(boarChances()),
    Buffalo(buffaloChances()),
    Caterpillar(caterpillarChances()),
    Deer(deerChances()),
    Duck(duckChances()),
    Goat(goatChances()),
    Horse(horseChances()),
    Mouse(mouseChances()),
    Rabbit(rabbitChances()),
    Sheep(sheepChances()),
    Bear(bearChances()),
    Boa(boaChances()),
    Eagle(eagleChances()),
    Fox(foxChances()),
    Wolf(wolfChances());

    private final Map<Class<? extends Eatable>, Double> chances;

    AnimalType(Map<Class<? extends Eatable>, Double> chances) {
        this.chances = chances;
    }

    public Map<Class<? extends Eatable>, Double> getChances() {
        return chances;
    }

    private static Map<Class<? extends Eatable>, Double> boarChances() {
        return new HashMap<>() {{
            put(org.example.objects.animals.predators.Wolf.class, 0d);
            put(org.example.objects.animals.predators.Boa.class, 0d);
            put(org.example.objects.animals.predators.Fox.class, 0d);
            put(org.example.objects.animals.predators.Bear.class, 0d);
            put(org.example.objects.animals.predators.Eagle.class, 0d);
            put(org.example.objects.animals.herbivorous.Horse.class, 0d);
            put(org.example.objects.animals.herbivorous.Deer.class, 0d);
            put(org.example.objects.animals.herbivorous.Rabbit.class, 0d);
            put(org.example.objects.animals.herbivorous.Mouse.class, 50d);
            put(org.example.objects.animals.herbivorous.Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 90d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> buffaloChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> caterpillarChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> deerChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> duckChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Caterpillar.class, 90d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> goatChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> horseChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> mouseChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 90d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> rabbitChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 100d);
        }};

    }

    private static Map<Class<? extends Eatable>, Double> sheepChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 0d);
            put(Mouse.class, 0d);
            put(Goat.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 0d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 100d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> bearChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 80d);
            put(Fox.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 40d);
            put(Deer.class, 80d);
            put(Rabbit.class, 80d);
            put(Mouse.class, 90d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 80d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 0d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> boaChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Fox.class, 15d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 20d);
            put(Mouse.class, 40d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 10d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 0d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> eagleChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Fox.class, 10d);
            put(Bear.class, 0d);
            put(Horse.class, 0d);
            put(Deer.class, 0d);
            put(Rabbit.class, 90d);
            put(Mouse.class, 90d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 80d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 0d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> foxChances() {
        return new HashMap<>() {{
            put(Wolf.class, 0d);
            put(Boa.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 00d);
            put(Deer.class, 0d);
            put(Rabbit.class, 70d);
            put(Mouse.class, 90d);
            put(Goat.class, 0d);
            put(Sheep.class, 0d);
            put(Boar.class, 0d);
            put(Buffalo.class, 0d);
            put(Duck.class, 60d);
            put(Caterpillar.class, 40d);
            put(Grass.class, 0d);
        }};
    }

    private static Map<Class<? extends Eatable>, Double> wolfChances() {
        return new HashMap<>() {{
            put(Boa.class, 0d);
            put(Fox.class, 0d);
            put(Bear.class, 0d);
            put(Eagle.class, 0d);
            put(Horse.class, 10d);
            put(Deer.class, 15d);
            put(Rabbit.class, 60d);
            put(Mouse.class, 80d);
            put(Goat.class, 60d);
            put(Sheep.class, 70d);
            put(Boar.class, 15d);
            put(Buffalo.class, 10d);
            put(Duck.class, 40d);
            put(Caterpillar.class, 0d);
            put(Grass.class, 0d);
        }};
    }

}
