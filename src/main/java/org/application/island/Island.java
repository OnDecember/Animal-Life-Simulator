package org.application.island;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.application.annotations.Config;
import org.application.config.database.DataBase;
import org.application.config.database.Record;
import org.application.objects.Organism;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@Config(filePath = "island/island.yaml")
public class Island {

    private final Map<Class<? extends Organism>, Record> dataBase = DataBase.getInstance().getDataBase();

    private int width;
    private int height;
    public Location[][] locations;

    {
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("island/island.yaml")) {
            Yaml yaml = new Yaml();
            Map<String, Integer> map = yaml.load(inputStream);
            this.width = map.get("width");
            this.height = map.get("height");
        } catch (IOException exception) {
            throw new RuntimeException("file not found", exception);
        }
        locations = new Location[height][width];
    }

    public void initIsland() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = createLocation();
            }
        }
    }

    private Location createLocation() {
        Location location = new Location();
        DataBase.setObjects()
                .forEach(clazz -> {
                    Record record = dataBase.get(clazz);
                    int maxCountOnCell = location.countOfAnimals(record.getMaxCountOnCell());
                    if (maxCountOnCell != 0) {
                        location.fillLocation(clazz, record, maxCountOnCell);
                    }

                });
        return location;
    }

}
