package dev.wgdp.minecraft.mod.datagen;

import dev.wgdp.minecraft.mod.register.FluidRegister;
import dev.wgdp.minecraft.mod.Onsen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OnsenFluidTagsProvider extends FluidTagsProvider {
    public OnsenFluidTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider,
                                  @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, Onsen.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(FluidTags.WATER)
                .add(FluidRegister.SOURCE_ONSEN_WATER.get())
                .add(FluidRegister.FLOWING_ONSEN_WATER.get());
    }
}
