package org.application.island;

import lombok.Getter;
import lombok.Setter;
import org.application.objects.Organism;

import java.lang.reflect.Type;
import java.util.Map;

@Getter
@Setter
public class Location {

    private int maxObjects;
    Map<Type, Organism> objects;
}
