package fr.wither.mecha.item.custom;

import fr.wither.mecha.entity.ModEntities;
import fr.wither.mecha.entity.custom.MK1Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

import java.util.Objects;

public class MechaItem  extends Item {
    public MechaItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            Direction direction = pContext.getClickedFace();
            BlockPos positionClicked = pContext.getClickedPos();

            BlockState blockstate = level.getBlockState(positionClicked);
            EntityType<MK1Entity> mk1Entity = ModEntities.MK1.get();

            BlockPos blockpos1;
            if (blockstate.getCollisionShape(level, positionClicked).isEmpty()) {
                blockpos1 = positionClicked;
            } else {
                blockpos1 = positionClicked.relative(direction);
            }

            if (mk1Entity.spawn((ServerLevel)level, pContext.getItemInHand(), pContext.getPlayer(), blockpos1, MobSpawnType.SPAWN_EGG, true, !Objects.equals(positionClicked, blockpos1) && direction == Direction.UP) != null) {
                pContext.getItemInHand().shrink(1);
                level.gameEvent(pContext.getPlayer(), GameEvent.ENTITY_PLACE, positionClicked);
            }
        }


        return InteractionResult.SUCCESS;
    }
}
