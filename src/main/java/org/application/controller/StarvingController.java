package org.application.controller;

import org.application.console.Console;
import org.application.global.GlobalVariables;
import org.application.island.Island;
import org.application.island.Location;
import org.application.objects.animals.Animal;

public class StarvingController extends Controller {

    private final double starvingPercent = 0.2;

    public StarvingController(Island island) {
        super(island);
    }

    @Override
    protected void doAction(Location location) {
        location.getSetOrganismsOnLocation()
                .stream()
                .filter(organism -> organism instanceof Animal animal && animal.isAlive())
                .map(organism -> (Animal) organism)
                .forEach(this::starving);
    }

    private void starving(Animal animal) {
        double starvingPerStep = animal.getMaxSatiatingFood() * starvingPercent;
        double saturation = animal.getSaturation();
        if (saturation <= starvingPerStep) {
            animal.die();
            Console.logStarvingOrganism(animal.getClass());
            Console.logDeadOrganism(animal.getClass());
        }
        else animal.setSaturation(saturation - starvingPerStep);
    }
}
