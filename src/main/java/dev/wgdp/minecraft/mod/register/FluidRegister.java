package dev.wgdp.minecraft.mod.register;

import dev.wgdp.minecraft.mod.Onsen;
import dev.wgdp.minecraft.mod.fluid.OnsenWaterFluidTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import static dev.wgdp.minecraft.mod.Onsen.MODID;

public class FluidRegister {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, MODID);
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, Onsen.MODID);

    public static final DeferredHolder<FluidType, FluidType> ONSEN_WATER_FLUID_TYPE = OnsenWaterFluidTypes.register("onsen_water_fluid_type",
            FluidType.Properties.create());

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> SOURCE_ONSEN_WATER = FLUIDS.register("onsen_water_fluid",
            () -> new BaseFlowingFluid.Source(FluidRegister.ONSEN_WATER_PROPERTIES));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_ONSEN_WATER = FLUIDS.register("flowing_onsen_water",
            () -> new BaseFlowingFluid.Flowing(FluidRegister.ONSEN_WATER_PROPERTIES));
    public static final BaseFlowingFluid.Properties ONSEN_WATER_PROPERTIES = new BaseFlowingFluid.Properties(
            ONSEN_WATER_FLUID_TYPE, SOURCE_ONSEN_WATER, FLOWING_ONSEN_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(BlockRegister.ONSEN_WATER_BLOCK).bucket(ItemRegister.ONSEN_WATER_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }
}
