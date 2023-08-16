package org.application.console;

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
        addAllOrganismToStatistic();
        System.out.println("_".repeat(54));
        System.out.printf("|%-12s| %-8s| %-8s| %-8s| %-8s|%n", "Organism", "All", "Born", "Dead", "Killed");
        System.out.printf("|%-12s|%-8s|%-8s|%-8s|%-8s|%n", "_".repeat(12), "_".repeat(9), "_".repeat(9), "_".repeat(9), "_".repeat(9));
        statistic.forEach((key, value) -> System.out.printf("|%-12s| %-8d| %-8d| %-8d| %-8d|%n", key.getSimpleName(), value.all, value.born, value.dead, value.killed));
        System.out.println("¯".repeat(54));
        System.out.println("\n".repeat(3));
    }

    private void addAllOrganismToStatistic() {
        Map<Class<? extends Organism>, Set<Organism>> map = island.getGroupingOrganismMap();
        map.forEach((key, value) -> logAllOrganism(key, value.size()));
    }

    private static Statistic getStatistic(Class<? extends Organism> clazz) {
        if (!statistic.containsKey(clazz)) {
            statistic.put(clazz, new Statistic());
        }
        return statistic.get(clazz);
    }

    private static void logAllOrganism(Class<? extends Organism> clazz, Integer numberOfOrganisms) {
        getStatistic(clazz).all = numberOfOrganisms;
    }

    public static void logBornOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).born++;
    }

    public static void logDeadOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).dead++;
    }

    public static void logKilledOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).killed++;
    }

    private static class Statistic {

        private int all;
        private int born;
        private int dead;
        private int killed;

        private Statistic() {
        }

    }
}
