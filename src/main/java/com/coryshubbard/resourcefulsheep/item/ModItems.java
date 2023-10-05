package com.coryshubbard.resourcefulsheep.item;

import com.coryshubbard.resourcefulsheep.ResourcefulSheep;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResourcefulSheep.MOD_ID);

    /*
    Blank Item
    public static final RegistryObject<Item> NAME =
        ITEMS.register("name",
            () -> new Item(
                new Item.Properties()));
     */

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
