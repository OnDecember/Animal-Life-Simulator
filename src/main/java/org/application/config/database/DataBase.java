package org.application.config.database;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import lombok.Getter;
import org.application.annotations.FilePath;
import org.application.enums.ObjectType;
import org.application.exception.DataBaseLoadException;
import org.application.objects.Organism;
import org.application.objects.animals.herbivorous.Rabbit;
import org.application.objects.animals.predators.Wolf;
import org.application.objects.plants.Grass;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Getter
public class DataBase {

    @Getter
    private static final DataBase instance = new DataBase();
    private final Map<ObjectType, Record> dataBase;

    private DataBase(){
        dataBase = new HashMap<>() {{
            put(ObjectType.Wolf, loadObject(Wolf.class));
            put(ObjectType.Rabbit, loadObject(Rabbit.class));
            put(ObjectType.Grass, loadObject(Grass.class));
        }};
    }

    private Record loadObject(Class<? extends Organism> organism) {
        ObjectMapper mapper = new YAMLMapper();
        FilePath filePath = organism.getAnnotation(FilePath.class);
        URL url = organism.getClassLoader().getResource(filePath.filePath());
        try {
            return mapper.readValue(url, Record.class);
        } catch (IOException e) {
            throw new DataBaseLoadException(e);
        }
    }
}