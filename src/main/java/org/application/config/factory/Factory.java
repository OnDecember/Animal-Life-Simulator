package org.application.config.factory;

import org.application.config.database.DataBase;
import org.application.config.database.Record;
import org.application.objects.Organism;

import java.lang.reflect.InvocationTargetException;

public class Factory {

    private final DataBase dataBase = DataBase.getInstance();

    public Organism create(Class<? extends Organism> clazz, Record record) {
        try {
            return clazz.getConstructor(Record.class).newInstance(record);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException exception) {
            throw new RuntimeException(exception);
        }
    }
}