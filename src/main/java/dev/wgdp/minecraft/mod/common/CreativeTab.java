package dev.wgdp.minecraft.mod.common;

import dev.wgdp.minecraft.mod.register.RegisterBlock;
import dev.wgdp.minecraft.mod.register.ItemRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import dev.wgdp.minecraft.mod.Onsen;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Onsen.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.examplemod")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegister.ONSEN_WATER_BUCKET.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegister.ONSEN_WATER_BUCKET.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());


    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
