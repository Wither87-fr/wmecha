package fr.wither.mecha.item;

import fr.wither.mecha.StaticFields;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StaticFields.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MECHA_TAB = CREATIVE_MOD_TABS.register("mecha_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GEAR.get())).title(Component.translatable("creativetab.mecha_tab")).displayItems((itemDisplayParameters, output) -> {
        output.accept(new ItemStack(ModItems.GEAR.get()));
        output.accept(new ItemStack(ModItems.EXTERNAL_GEAR.get()));
        output.accept(new ItemStack(ModItems.ENGINE.get()));
        output.accept(new ItemStack(ModItems.RIGHT_ARM.get()));
        output.accept(new ItemStack(ModItems.LEFT_ARM.get()));
        output.accept(new ItemStack(ModItems.LEGS.get()));
        output.accept(new ItemStack(ModItems.COCKPIT.get()));
        output.accept(new ItemStack(ModItems.MECHA.get()));
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
