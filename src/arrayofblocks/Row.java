package arrayofblocks;

import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by codeupnyc09 on 5/17/17.
 */
public class Row extends AbstractRow {

    public BlockType[] getRow() {
        BlockType[] myRow = {BlockType.DiamondBlock, BlockType.DiamondBlock, BlockType.DiamondBlock, BlockType.DiamondBlock, BlockType.DiamondBlock};
        return myRow;
    }
}
