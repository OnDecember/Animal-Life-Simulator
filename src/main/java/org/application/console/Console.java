package org.application.console;

import lombok.Data;
import lombok.Getter;
import org.application.global.GlobalVariables;
import org.application.island.Island;
import org.application.objects.Organism;
import org.application.objects.animals.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Console implements Runnable {

    private static final Map<Class<? extends Organism>, Statistic> statistic = new HashMap<>();
    private final Island island;
    private final long start = System.currentTimeMillis();

    public Console(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        displayInfo();
    }

    public void displayInfo() {
        GlobalVariables.lock.lock();
        addAliveOrganismToStatistic();
        System.out.println("_".repeat(98));
        System.out.printf("|%-12s| %-10s| %-10s| %-10s| %-10s| %-10s| %-10s| %-10s|%n", "Organism", "All", "Alive", "Born", "Killed", "Starving", "Dead", "Eat");
        System.out.printf("|%-12s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "_".repeat(12), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11), "_".repeat(11));
        statistic.forEach((key, value) -> System.out.printf("|%-12s| %-10d| %-10d| %-10d| %-10d| %-10d| %-10d| %-10d|%n", key.getSimpleName(), value.alive + value.dead, value.alive, value.born, value.killed, value.starving, value.dead, value.eat));
        System.out.println("¯".repeat(98));
        Statistic allStatistic = allAnimalStatistic();
        System.out.printf("|%-12s| %-10d| %-10d| %-10d| %-10d| %-10d| %-10d| %-10d|%n", "All animals", allStatistic.alive + allStatistic.dead, allStatistic.alive, allStatistic.born, allStatistic.killed, allStatistic.starving, allStatistic.dead, allStatistic.eat);
        System.out.println("¯".repeat(98));
        time();
        System.out.println("\n".repeat(1));
        GlobalVariables.lock.unlock();
    }

    private void time() {
        long end = System.currentTimeMillis();
        long millisDiff = end - start;
        int second = (int) millisDiff / 1000;
        int min = second / 60;
        if (second < 60) System.out.printf("Life time: %d sec.%n", second);
        if (second >= 60) System.out.printf("Life time: %d min. %d sec.%n", min, second - min * 60);
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

    private Statistic allAnimalStatistic() {
        Statistic allStatistic = new Statistic();

        allStatistic.alive = statistic.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getSuperclass().getSuperclass().equals(Animal.class))
                .map(Map.Entry::getValue)
                .reduce(0, (total, el) -> total + el.alive, Integer::sum);

        allStatistic.dead = statistic.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getSuperclass().getSuperclass().equals(Animal.class))
                .map(Map.Entry::getValue)
                .reduce(0, (total, el) -> total + el.dead, Integer::sum);

        allStatistic.starving = statistic.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getSuperclass().getSuperclass().equals(Animal.class))
                .map(Map.Entry::getValue)
                .reduce(0, (total, el) -> total + el.starving, Integer::sum);

        allStatistic.killed = statistic.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getSuperclass().getSuperclass().equals(Animal.class))
                .map(Map.Entry::getValue)
                .reduce(0, (total, el) -> total + el.killed, Integer::sum);

        allStatistic.born = statistic.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getSuperclass().getSuperclass().equals(Animal.class))
                .map(Map.Entry::getValue)
                .reduce(0, (total, el) -> total + el.born, Integer::sum);

        allStatistic.eat = statistic.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getSuperclass().getSuperclass().equals(Animal.class))
                .map(Map.Entry::getValue)
                .reduce(0, (total, el) -> total + el.eat, Integer::sum);

        return allStatistic;
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
    public static void logEatOrganism(Class<? extends Organism> clazz) {
        getStatistic(clazz).eat++;
    }


    private static class Statistic {

        private int alive;
        private int born;
        private int killed;
        private int starving;
        private int dead;
        private int eat;

        private Statistic() {
        }

    }
}
