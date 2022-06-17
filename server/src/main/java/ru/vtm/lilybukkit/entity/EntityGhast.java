package ru.vtm.lilybukkit.entity;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.util.Vector;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/**
 * A stub class for a non-existent entity
 */
public class EntityGhast extends EntityFlying implements Ghast {
    public EntityGhast(net.minecraft.src.World world) {
        super(world);
    }

    /**
     * Gets the entity's health from 0-20, where 0 is dead and 20 is full
     *
     * @return Health represented from 0-20
     */
    @Override
    public int getHealth() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the entity's health from 0-20, where 0 is dead and 20 is full
     *
     * @param health New health represented from 0-20
     */
    @Override
    public void setHealth(int health) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the height of the entity's head above its Location
     *
     * @return Height of the entity's eyes above its Location
     */
    @Override
    public double getEyeHeight() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the height of the entity's head above its Location
     *
     * @param ignoreSneaking@return Height of the entity's eyes above its Location
     */
    @Override
    public double getEyeHeight(boolean ignoreSneaking) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get a Location detailing the current eye position of the LivingEntity.
     *
     * @return a Location at the eyes of the LivingEntity.
     */
    @Override
    public Location getEyeLocation() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets all blocks along the player's line of sight
     * List iterates from player's position to target inclusive
     *
     * @param transparent
     * @param maxDistance
     * @return List containing all blocks along the player's line of sight
     */
    @Override
    public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the block that the player has targeted
     *
     * @param transparent
     * @param maxDistance
     * @return Block that the player has targeted
     */
    @Override
    public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the last two blocks along the player's line of sight.
     * The target block will be the last block in the list.
     *
     * @param transparent
     * @param maxDistance
     * @return List containing the last 2 blocks along the player's line of sight
     */
    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Throws an egg from the entity.
     */
    @Override
    public Egg throwEgg() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Throws a snowball from the entity.
     */
    @Override
    public Snowball throwSnowball() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Shoots an arrow from the entity.
     *
     * @return
     */
    @Override
    public Arrow shootArrow() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns whether this entity is inside a vehicle.
     *
     * @return
     */
    @Override
    public boolean isInsideVehicle() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Leave the current vehicle. If the entity is currently in a vehicle
     * (and is removed from it), true will be returned, otherwise false will
     * be returned.
     *
     * @return
     */
    @Override
    public boolean leaveVehicle() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get the vehicle that this player is inside. If there is no vehicle,
     * null will be returned.
     *
     * @return
     */
    @Override
    public Vehicle getVehicle() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the amount of air that this entity has remaining, in ticks
     *
     * @return Amount of air remaining
     */
    @Override
    public int getRemainingAir() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the amount of air that this entity has remaining, in ticks
     *
     * @param ticks Amount of air remaining
     */
    @Override
    public void setRemainingAir(int ticks) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the maximum amount of air this entity can have, in ticks
     *
     * @return Maximum amount of air
     */
    @Override
    public int getMaximumAir() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the maximum amount of air this entity can have, in ticks
     *
     * @param ticks Maximum amount of air
     */
    @Override
    public void setMaximumAir(int ticks) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Deals the given amount of damage to this entity
     *
     * @param amount Amount of damage to deal
     */
    @Override
    public void damage(int amount) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Deals the given amount of damage to this entity, from a specified entity
     *
     * @param amount Amount of damage to deal
     * @param source Entity which to attribute this damage from
     */
    @Override
    public void damage(int amount, Entity source) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the entities current maximum noDamageTicks
     * This is the time in ticks the entity will become unable to take
     * equal or less damage than the lastDamage
     *
     * @return noDamageTicks
     */
    @Override
    public int getMaximumNoDamageTicks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the entities current maximum noDamageTicks
     *
     * @param ticks maximumNoDamageTicks
     */
    @Override
    public void setMaximumNoDamageTicks(int ticks) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the entities lastDamage taken in the current noDamageTicks time.
     * Only damage higher than this amount will further damage the entity.
     *
     * @return lastDamage
     */
    @Override
    public int getLastDamage() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the entities current maximum noDamageTicks
     *
     * @param damage last damage
     */
    @Override
    public void setLastDamage(int damage) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the entities current noDamageTicks
     *
     * @return noDamageTicks
     */
    @Override
    public int getNoDamageTicks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the entities current noDamageTicks
     *
     * @param ticks NoDamageTicks
     */
    @Override
    public void setNoDamageTicks(int ticks) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the entity's current position
     *
     * @return Location containing the position of this entity
     */
    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets this entity's velocity
     *
     * @param velocity New velocity to travel with
     */
    @Override
    public void setVelocity(Vector velocity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets this entity's current velocity
     *
     * @return Current travelling velocity of this entity
     */
    @Override
    public Vector getVelocity() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the current world this entity resides in
     *
     * @return World
     */
    @Override
    public World getWorld() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Teleports this entity to the given location
     *
     * @param location New location to teleport this entity to
     * @return <code>true</code> if the teleport was successful
     */
    @Override
    public boolean teleport(Location location) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Teleports this entity to the target Entity
     *
     * @param destination Entity to teleport this entity to
     * @return <code>true</code> if the teleport was successful
     */
    @Override
    public boolean teleport(Entity destination) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns a list of entities within a bounding box defined by x,y,z centered around player
     *
     * @param x Size of the box along x axis
     * @param y Size of the box along y axis
     * @param z Size of the box along z axis
     * @return List<Entity> List of entities nearby
     */
    @Override
    public List<Entity> getNearbyEntities(double x, double y, double z) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns a unique id for this entity
     *
     * @return Entity id
     */
    @Override
    public int getEntityId() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the entity's current fire ticks (ticks before the entity stops being on fire).
     *
     * @return int fireTicks
     */
    @Override
    public int getFireTicks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the entity's maximum fire ticks.
     *
     * @return int maxFireTicks
     */
    @Override
    public int getMaxFireTicks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the entity's current fire ticks (ticks before the entity stops being on fire).
     *
     * @param ticks
     */
    @Override
    public void setFireTicks(int ticks) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Mark the entity's removal.
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns true if this entity has been marked for removal.
     */
    @Override
    public boolean isDead() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the {@link Server} that contains this Entity
     *
     * @return Server instance running this Entity
     */
    @Override
    public Server getServer() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Gets the primary passenger of a vehicle. For vehicles that could have
     * multiple passengers, this will only return the primary passenger.
     *
     * @return an entity
     */
    @Override
    public Entity getPassenger() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Set the passenger of a vehicle.
     *
     * @param passenger
     * @return false if it could not be done for whatever reason
     */
    @Override
    public boolean setPassenger(Entity passenger) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns true if the vehicle has no passengers.
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Eject any passenger. True if there was a passenger.
     *
     * @return
     */
    @Override
    public boolean eject() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the distance this entity has fallen
     *
     * @return
     */
    @Override
    public float getFallDistance() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the fall distance for this entity
     *
     * @param distance
     */
    @Override
    public void setFallDistance(float distance) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Record the last {@link EntityDamageEvent} inflicted on this entity
     *
     * @param event a {@link EntityDamageEvent}
     */
    @Override
    public void setLastDamageCause(EntityDamageEvent event) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Retrieve the last {@link EntityDamageEvent} inflicted on this entity. This event may have been cancelled.
     *
     * @return the last known {@link EntityDamageEvent} or null if hitherto unharmed
     */
    @Override
    public EntityDamageEvent getLastDamageCause() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns a unique and persistent id for this entity
     *
     * @return unique id
     */
    @Override
    public UUID getUniqueId() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
