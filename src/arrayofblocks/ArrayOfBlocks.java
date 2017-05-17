/***
 * Excerpted from"Learn to Program with Minecraft Plugins, CanaryMods Edition",
 * published by The Pragmatic Bookshelf.
 * Co[yright apply tothis code. It may not be used to creat training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pramaticprogramer.com/titles/ahmine2 for more book information
 ***/
package arrayofblocks;

import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.position.Location;
import net.canarymod.api.world.blocks.BlockType;
import com.pragprog.ahmine.ez.EZPlugin;

import java.util.ArrayList;

public class ArrayOfBlocks extends EZPlugin {

    public void buildTower(Player me) {
        Location loc = me.getLocation();
        loc.setX(loc.getX() + 1); // Not right on top of player

        Building building = new Building();

        for (Level level : building.levels) {
            for (BlockType[] eachTower : level.collection) {
                for (BlockType towerMaterials : eachTower) {
                    setBlockAt(loc, towerMaterials);
                    loc.setZ(loc.getZ() + 1);// go up one each time
                }
                loc.setZ(loc.getZ() - 5);
                loc.setX(loc.getX() + 1);
            }
            loc.setX(loc.getX() - 5);
            loc.setY(loc.getY() + 1);
        }


    }


    @Command(aliases = {"arrayofblocks"},
            description = "Create an array of blocks",
            permissions = {""},
            toolTip = "/arrayofblocks")
    public void arrayofblocksCommand (MessageReceiver caller, String[]args){
        if (caller instanceof Player) {
            Player me = (Player) caller;
            buildTower(me);
        }
    }
}