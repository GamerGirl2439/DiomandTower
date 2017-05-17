package arrayofblocks;

import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by codeupnyc09 on 5/17/17.
 */
public class Row1 extends AbstractRow {

    public BlockType[] getRow1() {
        BlockType[] row1 = {BlockType.DiamondBlock, BlockType.Air, BlockType.Air, BlockType.Air, BlockType.DiamondBlock};
        return row1;

    }
}
