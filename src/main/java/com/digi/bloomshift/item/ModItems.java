package com.digi.bloomshift.item;

import com.digi.bloomshift.Bloomshift;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLOOM_DUST = registerItem("bloom_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Bloomshift.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Bloomshift.LOGGER.info("Registering Mod Items for " + Bloomshift.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLOOM_DUST);
        });
    }
}
