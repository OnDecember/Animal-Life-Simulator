package org.application;

import org.application.config.database.DataBase;
import org.application.config.database.Record;
import org.application.island.Island;
import org.application.objects.animals.predators.Wolf;

import java.util.Arrays;
import java.util.Collection;

public class Survival {
    public static void main(String[] args) {
        Island island = new Island();
        island.initIsland();
        System.out.println(Arrays.stream(island.locations)
                .flatMap(Arrays::stream)
                .map(location -> location.getObjects().values())
                .flatMap(Collection::stream)
                .mapToLong(Collection::size)
                .sum());
    }
}