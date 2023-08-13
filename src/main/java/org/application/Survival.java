package org.application;

import org.application.console.Console;
import org.application.island.Island;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Survival {
    public static void main(String[] args) throws InterruptedException {
        Island island = new Island();
        Console console = new Console(island);
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.scheduleAtFixedRate(console, 0, 1, TimeUnit.SECONDS);

        Simulation simulation = new Simulation(island);

        service.scheduleAtFixedRate(simulation, 0, 1, TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(10);
        service.shutdown();
    }
}