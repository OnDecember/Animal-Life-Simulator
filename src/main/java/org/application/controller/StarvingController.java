package org.application.controller;

import org.application.console.Console;
import org.application.global.GlobalVariables;
import org.application.island.Island;
import org.application.island.Location;
import org.application.objects.animals.Animal;

public class StarvingController extends Controller {

    private final double starvingPercent = 0.30;

    public StarvingController(Island island) {
        super(island);
    }

    @Override
    protected void doAction(Location location) {
        GlobalVariables.lock.lock();
        location.getSetOrganismsOnLocation()
                .stream()
                .filter(organism -> organism instanceof Animal animal)
                .map(Animal.class::cast)
                .filter(animal -> animal.getMaxSatiatingFood() > 0)
                .forEach(animal -> starving(animal, location));
        GlobalVariables.lock.unlock();
    }

    private void starving(Animal animal, Location location) {
        double starvingPerStep = animal.getMaxSatiatingFood() * starvingPercent;
        double saturation = animal.getSaturation();
        if (saturation <= starvingPerStep) {
            location.removeOrganism(animal);
            Console.logStarvingOrganism(animal.getClass());
            Console.logDeadOrganism(animal.getClass());
        } else animal.setSaturation(saturation - starvingPerStep);
    }
}
