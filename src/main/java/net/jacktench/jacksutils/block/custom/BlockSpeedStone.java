package net.jacktench.jacksutils.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockSpeedStone extends Block {

    public BlockSpeedStone(Properties properties) {
        super(properties);
    }

    // Is called when the block is stepped on.
    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {

        // Checks if entity that steps on block is a living entity, aka a mob or player.
        if(entity instanceof LivingEntity livingEntity) {
            // Applies a buff to movement speed for 30 ticks, or 1.5 seconds.
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30));
        }

        super.stepOn(level, pos, state, entity);

    }
}
