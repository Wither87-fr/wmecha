package fr.wither.mecha.event;

import fr.wither.mecha.StaticFields;
import fr.wither.mecha.entity.ModEntities;
import fr.wither.mecha.entity.custom.MK1Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StaticFields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MK1.get(), MK1Entity.createAttributes().build());
    }
}
