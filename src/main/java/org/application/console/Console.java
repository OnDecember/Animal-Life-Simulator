package org.application.console;

import org.application.island.Island;
import org.application.objects.Organism;

import java.util.Map;
import java.util.Set;

public class Console implements Runnable {

    private final Island island;

    public Console(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        displayInfo();
    }

    public void displayInfo() {
        Map<Class<? extends Organism>, Set<Organism>> map = island.getGroupingOrganismMap();
        map.forEach((key, value) -> System.out.println(key.getSimpleName() + " : " + value.size()));
        System.out.println("------------------");
    }
}
