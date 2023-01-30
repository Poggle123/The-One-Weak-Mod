package net.poggle123.testmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.poggle123.testmod.Testmod;

public class ModTags {
    public static final TagKey<Block> PORTAL_FRAME_BLOCKS = tag("portal_frame_blocks");
    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(Testmod.MOD_ID, name));
    }
}
