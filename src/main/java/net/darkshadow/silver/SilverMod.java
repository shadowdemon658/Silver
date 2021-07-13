package net.darkshadow.silver;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.darkshadow.silver.block.ModBlocks;
import net.darkshadow.silver.item.ModItems;
// import net.darkshadow.silver.world.OreGeneration;
import net.darkshadow.silver.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SilverMod implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "silver";
    public static final String MOD_NAME = "Silver Mod";

    public static final ItemGroup SILVER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(SilverMod.MOD_ID, "silver_group"))
            .icon(() -> new ItemStack(ModItems.SILVER_INGOT))
            .build();

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        ModItems.register();
        ModBlocks.register();
        OreGeneration.register();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}