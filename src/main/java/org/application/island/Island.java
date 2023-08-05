package org.application.island;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Island {

    private int width;
    private int height;
    public Location[][] locations = new Location[height][width];

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
