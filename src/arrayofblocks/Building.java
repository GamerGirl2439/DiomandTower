package arrayofblocks;

import java.util.ArrayList;

/**
 * Created by codeupnyc09 on 5/17/17.
 */
public class Building {
    public ArrayList<Level> levels = new ArrayList<Level>();


    private Level level = new Level();

    public Building() {
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());
        levels.add(level.getLevel());

    }

    public Building getBuilding() {
        return this;
    }
}
