package org.application.island;

import lombok.*;
import org.application.config.database.Record;
import org.application.config.factory.Factory;
import org.application.objects.Organism;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class Location {

    private final Factory factory = Factory.getInstance();
    private final Map<Class<? extends Organism>, Set<Organism>> objects = new HashMap<>();

    private final int x;
    private final int y;


    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    public Set<Organism> getOrganism() {
        return objects.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    public void removeOrganism(Organism organism) {
        objects.get(organism.getClass()).remove(organism);
    }

    public Set<Organism> getSpeciesAnimalsOnLocation(Organism organism) {
        Map<Class<? extends Organism>, Set<Organism>> organismOnLocation = getObjects();
        if (!organismOnLocation.containsKey(organism.getClass())) return new HashSet<>();
        return organismOnLocation.get(organism.getClass());
    }

    public boolean checkMaxCountOrganismOnLocation(Organism organism) {
        int countOnLocation = getSpeciesAnimalsOnLocation(organism).size();
        int maxCountOnCell = organism.getMaxCountOnCell();
        return countOnLocation >= maxCountOnCell;
    }

}
