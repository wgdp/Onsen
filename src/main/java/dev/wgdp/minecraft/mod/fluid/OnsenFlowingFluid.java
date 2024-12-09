package dev.wgdp.minecraft.mod.fluid;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import org.joml.Vector3f;

public class OnsenFlowingFluid extends BaseFlowingFluid {

    protected OnsenFlowingFluid(Properties properties) {
        super(properties);
    }

    @Override
    public Fluid getFlowing() {

        return super.getFlowing();
    }

    @Override
    public boolean isSource(FluidState fluidState) {
        return false;
    }

    @Override
    public int getAmount(FluidState fluidState) {
        return 0;
    }
}

