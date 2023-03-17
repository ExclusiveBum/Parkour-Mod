package net.exclusivebum.parkourandweaponsmod.item;


import net.exclusivebum.parkourandweaponsmod.ParkourAndWeaponsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ParkourAndWeaponsMod.MOD_ID);

    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () ->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () ->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
