package arrayofblocks;

import net.canarymod.api.world.blocks.Block;
import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by codeupnyc09 on 5/5/17.
 */
public class Level {
    public ArrayList<BlockType[]> collection = new ArrayList<BlockType[]>();
    Row row = new Row();
    Row1 row1 = new Row1();

    public Level() {
        collection.add(row.getRow());
        collection.add(row1.getRow1());
        collection.add(row1.getRow1());
        collection.add(row1.getRow1());
        collection.add(row.getRow());
    }

    public Level getLevel() {
        return this;
    }
}
   