package net.canarymod.api.entity.throwable;

import net.canarymod.api.entity.CanaryEntity;
import net.canarymod.api.entity.living.EntityLiving;

/**
 * EntityThrowable wrapper implementation
 *
 * @author Jason (darkdiplomat)
 */
public abstract class CanaryEntityThrowable extends CanaryEntity implements EntityThrowable {

    /**
     * Constructs a new wrapper for EntityThrowable
     *
     * @param entity
     *         the EntityThrowable to be wrapped
     */
    public CanaryEntityThrowable(net.minecraft.entity.projectile.EntityThrowable entity) {
        super(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getGravity() {
        return getHandle().gravity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setGravity(float velocity) {
        getHandle().gravity = velocity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityLiving getThrower() {
        return (EntityLiving) getHandle().j().getCanaryEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setProjectileHeading(double motionX, double motionY, double motionZ, float rotationYaw, float rotationPitch) {
        getHandle().c(motionX, motionY, motionZ, rotationYaw, rotationPitch);
    }

    @Override
    public net.minecraft.entity.projectile.EntityThrowable getHandle() {
        return (net.minecraft.entity.projectile.EntityThrowable) entity;
    }
}
