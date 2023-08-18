package org.application.island;

import lombok.Getter;
import lombok.Setter;
import org.application.config.database.Record;
import org.application.config.factory.Factory;
import org.application.global.GlobalVariables;
import org.application.objects.Organism;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Getter
@Setter
public class Location {

    private final Factory factory = Factory.getInstance();
    private ConcurrentMap<Class<? extends Organism>, Set<Organism>> organisms = new ConcurrentHashMap<>();
    private ThreadLocalRandom random = GlobalVariables.random;

    private final int x;
    private final int y;


    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void fillLocation(Class<? extends Organism> value, Record record, int maxCountOnCell) {
        Set<Organism> set = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i < maxCountOnCell; i++) {
            set.add(factory.create(value, record));
        }
        organisms.put(value, set);
    }

    public int countOfAnimals(int maxCountOnCell) {
        return random.nextInt(maxCountOnCell + 1);
    }

    public synchronized Set<Organism> getSetOrganismsOnLocation() {
        return organisms.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    public void removeOrganism(Organism organism) {
        organisms.get(organism.getClass()).remove(organism);
    }

    public Set<Organism> getSpeciesAnimalsOnLocation(Organism organism) {
        Map<Class<? extends Organism>, Set<Organism>> organismOnLocation = getOrganisms();
        if (!organismOnLocation.containsKey(organism.getClass())) return new HashSet<>();
        return organismOnLocation.get(organism.getClass());
    }

    public boolean checkMaxCountOrganismOnLocation(Organism organism) {
        int countOnLocation = getSpeciesAnimalsOnLocation(organism).size();
        int maxCountOnCell = organism.getMaxCountOnCell();
        return countOnLocation >= maxCountOnCell;
    }

}
