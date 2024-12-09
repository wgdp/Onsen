package dev.wgdp.minecraft.mod.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import org.joml.Vector3f;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class BaseFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
//    private final int tintColor;
//    private final Vector3f fogColor;

//    public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final int tintColor, final Vector3f fogColor, final Properties properties) {
//        super(properties);
//        this.stillTexture = stillTexture;
//        this.flowingTexture = flowingTexture;
//        this.tintColor = tintColor;
//        this.fogColor = fogColor;
//    }

    public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final Properties properties) {
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
    }

    public IClientFluidTypeExtensions getClientFluidTypeExtensions() {
        return new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return stillTexture;
            }
            @Override
            public ResourceLocation getFlowingTexture() {
                return flowingTexture;
            }
//            @Override
//            public @Nullable ResourceLocation getOverlayTexture() {
//                return overlayTexture;
//            }
//            @Override
//            public int getTintColor() {
//                return tintColor;
//            }
//            @Override
//            public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level,
//                                                    int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
//                return fogColor;
//            }
//            @Override
//            public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick,
//                                        float nearDistance, float farDistance, FogShape shape) {
//                RenderSystem.setShaderFogStart(1f);
//                RenderSystem.setShaderFogEnd(6f); // distance when the fog starts
//            }
        };
    }

//    public int getTintColor() {
//        return tintColor;
//    }
//
//    public Vector3f getFogColor() {
//        return fogColor;
//    }
}

