package fr.wither.mecha.item;

import fr.wither.mecha.StaticFields;
import fr.wither.mecha.entity.ModEntities;
import fr.wither.mecha.item.custom.MechaItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StaticFields.MOD_ID);


    public static final RegistryObject<Item> GEAR = ITEMS.register("gear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENGINE = ITEMS.register("engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIGHT_ARM = ITEMS.register("right_arm", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEFT_ARM = ITEMS.register("left_arm", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEGS = ITEMS.register("legs", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCKPIT = ITEMS.register("cockpit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXTERNAL_GEAR = ITEMS.register("external_gear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHA = ITEMS.register("mecha", () -> new MechaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MECHA_SPAWN_EGG = ITEMS.register("mecha_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.MK1, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
