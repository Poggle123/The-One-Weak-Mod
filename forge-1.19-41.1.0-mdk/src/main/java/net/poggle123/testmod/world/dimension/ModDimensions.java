package net.poggle123.testmod.world.dimension;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.poggle123.testmod.Testmod;

public class ModDimensions {
    public static final ResourceKey<Level> TESTDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Testmod.MOD_ID, "testdim"));
    public  static final ResourceKey<DimensionType> TESTDIM_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(Testmod.MOD_ID, "testdim"));
    public static void register() {
        System.out.println("Registering ModDimensions for " + Testmod.MOD_ID);
    }
}