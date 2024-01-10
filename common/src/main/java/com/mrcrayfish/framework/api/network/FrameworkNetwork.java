package com.mrcrayfish.framework.api.network;

import com.mrcrayfish.framework.network.message.FrameworkMessage;
import net.minecraft.network.Connection;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.chunk.LevelChunk;

import java.util.List;
import java.util.function.Supplier;

/**
 * Author: MrCrayfish
 */
public interface FrameworkNetwork
{
    void send(Connection connection, Object message);

    void sendToPlayer(Supplier<ServerPlayer> supplier, Object message);

    void sendToTrackingEntity(Supplier<Entity> supplier, Object message);

    void sendToTrackingBlockEntity(Supplier<BlockEntity> supplier, Object message);

    void sendToTrackingLocation(Supplier<LevelLocation> supplier, Object message);

    void sendToTrackingChunk(Supplier<LevelChunk> supplier, Object message);

    void sendToNearbyPlayers(Supplier<LevelLocation> supplier, Object message);

    void sendToServer(Object message);

    void sendToAll(Object message);

    boolean isActive(Connection connection);
}
