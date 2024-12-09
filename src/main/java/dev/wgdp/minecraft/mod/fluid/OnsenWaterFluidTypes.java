package dev.wgdp.minecraft.mod.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;

import static dev.wgdp.minecraft.mod.register.FluidRegister.FLUID_TYPES;

public class OnsenWaterFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.parse("minecraft:block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.parse("minecraft:block/water_flow");
    // public static final ResourceLocation ONSEN_OVERLAY_RL = new ResourceLocation("block/water_still");


    public static DeferredHolder<FluidType, FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name,
                () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, properties));
    }

}
