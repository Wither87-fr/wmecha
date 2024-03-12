package fr.wither.mecha.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import fr.wither.mecha.StaticFields;
import fr.wither.mecha.entity.custom.MK1Entity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MK1Renderer extends MobRenderer<MK1Entity, MK1Model<MK1Entity>> {
    public MK1Renderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MK1Model<>(pContext.bakeLayer(ModModelLayers.MK1_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(MK1Entity mk1Entity) {
        return new ResourceLocation(StaticFields.MOD_ID, "textures/entity/mk1.png");
    }

}
