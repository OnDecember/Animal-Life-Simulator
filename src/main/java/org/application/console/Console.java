package org.application.console;

import lombok.Getter;
import org.application.global.GlobalVariables;
import org.application.island.Island;
import org.application.objects.Organism;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public record Console(Island island) implements Runnable {

    private static final Map<Class<? extends Organism>, Statistic> statistic = new HashMap<>();

    @Override
    public void run() {
        displayInfo();
    }

    public void displayInfo() {
        GlobalVariables.lock.lock();
        addAliveOrganismToStatistic();
        System.out.println("_".repeat(86));
        System.out.printf("|%-12s| %-10s| %-10s| %-10s| %-10s| %-10s| %-10s|%n", "Organism", "All", "Alive", "Born", "Killed", "Starving", "Dead");
        System.out.printf("|%-12s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "_".repeat(12), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11));
        statistic.forEach((key, value) -> System.out.printf("|%-12s| %-10d| %-10d| %-10d| %-10d| %-10d| %-10d|%n", key.getSimpleName(), value.alive + value.dead, value.alive, value.born, value.killed, value.starving, value.dead));
        System.out.println("¯".repeat(86));
        System.out.println("\n".repeat(1));
        GlobalVariables.lock.unlock();
    }

    private void addAliveOrganismToStatistic() {
        Map<Class<? extends Organism>, Set<Organism>> organismOnIsland = island.getGroupingOrganismMap();
        organismOnIsland.forEach((key, value) -> logAliveOrganism(key, value.size()));
    }

    private static Statistic getStatistic(Class<? extends Organism> clazz) {
        if (!statistic.containsKey(clazz)) {
            statistic.put(clazz, new Statistic());
        }
        return statistic.get(clazz);
    }

    private static void logAliveOrganism(Class<? extends Organism> clazz, Integer numberOfOrganisms) {
        getStatistic(clazz).alive = numberOfOrganisms;
    }

    public static void logBornOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).born++;
    }

    public static void logKilledOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).killed++;
    }

    public static void logStarvingOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).starving++;
    }

    public static void logDeadOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).dead++;
    }

    private static class Statistic {

        private int alive;
        private int born;
        private int killed;
        private int starving;
        private int dead;

        private Statistic() {
        }

    }
}
