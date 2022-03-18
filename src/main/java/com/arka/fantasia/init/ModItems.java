package com.arka.fantasia.init;

import com.arka.fantasia.Fantasia;
import com.arka.fantasia.utils.CustomItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fantasia.MODID);

    //items
    public static final RegistryObject<Item> BLUE_CRYSTAL = ITEMS.register("blue_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_MATERIALS)));

    //tools
    public static final RegistryObject<Item> CRYSTAL_SWORD = ITEMS.register("crystal_sword", () -> new SwordItem(CustomItemTier.CRYSTAL, 2, -2.0f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
}
