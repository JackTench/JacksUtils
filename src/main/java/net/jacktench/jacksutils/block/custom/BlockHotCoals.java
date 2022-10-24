package net.jacktench.jacksutils.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockHotCoals extends Block {

    public BlockHotCoals(Properties properties) {
        super(properties);
    }

    // Is called when the block is stepped on.
    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {

        // Checks if entity that steps on block is a living entity, aka a mob or player.
        if(entity instanceof LivingEntity livingEntity) {
            // Referenced how Magma Blocks work, sans water physics. Hurts player with fire damage.
            livingEntity.hurt(DamageSource.HOT_FLOOR, 1.0F);
        }

        super.stepOn(level, pos, state, entity);
    }
}
