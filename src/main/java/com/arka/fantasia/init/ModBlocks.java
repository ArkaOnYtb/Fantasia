package com.arka.fantasia.init;

import com.arka.fantasia.Fantasia;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Fantasia.MODID);

    public static final RegistryObject<Block> CRYSTAL_BLOCK = createBlock("crystal_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRYSTAL_ORE = createBlock("crystal_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(4).requiresCorrectToolForDrops()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {

        RegistryObject<Block> block = BLOCKS.register(name,supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
