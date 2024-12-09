package dev.wgdp.minecraft.mod.register;

import dev.wgdp.minecraft.mod.Onsen;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegister {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Onsen.MODID);
    public static final DeferredBlock<LiquidBlock> ONSEN_WATER_BLOCK = BLOCKS.register("onsen_water_block",
            () -> new LiquidBlock(FluidRegister.SOURCE_ONSEN_WATER.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));


    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
