package com.samo.samosfirst.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GreenBlock extends Block {
    public GreenBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(30f, 30f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .lightValue(15)
        );
    }
}
