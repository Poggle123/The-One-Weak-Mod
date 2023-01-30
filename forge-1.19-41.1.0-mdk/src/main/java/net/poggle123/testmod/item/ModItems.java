package net.poggle123.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.poggle123.testmod.Testmod;
import net.poggle123.testmod.item.custom.CatalystItem;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.MOD_ID);
    public static  final  RegistryObject<Item> ITEM1 = ITEMS.register("item1", CatalystItem::new);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
