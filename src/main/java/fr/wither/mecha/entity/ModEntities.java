package fr.wither.mecha.entity;

import fr.wither.mecha.StaticFields;
import fr.wither.mecha.entity.custom.MK1Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StaticFields.MOD_ID);


    public static final RegistryObject<EntityType<MK1Entity>> MK1 = ENTITY_TYPES.register("mk1", () -> EntityType.Builder.of(MK1Entity::new, MobCategory.MISC)
            .sized(5f, 15f).build("mk1"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
