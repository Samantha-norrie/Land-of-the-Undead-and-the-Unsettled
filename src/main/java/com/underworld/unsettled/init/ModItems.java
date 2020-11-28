package com.underworld.unsettled.init;

import com.underworld.unsettled.UnsettledMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnsettledMod.MOD_ID);
    public static final RegistryObject<Item> CURSED_SHROOM = ITEMS.register("unsettled_shroom", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
