package dev.wgdp.minecraft.mod.register;

import dev.wgdp.minecraft.mod.Onsen;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Onsen.MODID);

    public static final DeferredItem<BucketItem> ONSEN_WATER_BUCKET = ITEMS.register("onsen_water_bucket",
            () -> new BucketItem(FluidRegister.SOURCE_ONSEN_WATER.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
