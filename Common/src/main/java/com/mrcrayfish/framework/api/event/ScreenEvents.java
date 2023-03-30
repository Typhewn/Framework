package com.mrcrayfish.framework.api.event;

import com.mrcrayfish.framework.event.IScreenEvent;

/**
 * Author: MrCrayfish
 */
public class ScreenEvents
{
    public static final FrameworkEvent<IScreenEvent.Init> INIT = new FrameworkEvent<>(listeners -> (screen) -> {
        listeners.forEach(listener -> listener.handle(screen));
    });

    public static final FrameworkEvent<IScreenEvent.BeforeDraw> BEFORE_DRAW = new FrameworkEvent<>(listeners -> ((screen, poseStack, mouseX, mouseY, partialTick) -> {
        listeners.forEach(listener -> listener.handle(screen, poseStack, mouseX, mouseY, partialTick));
    }));

    public static final FrameworkEvent<IScreenEvent.AfterDraw> AFTER_DRAW = new FrameworkEvent<>(listeners -> ((screen, poseStack, mouseX, mouseY, partialTick) -> {
        listeners.forEach(listener -> listener.handle(screen, poseStack, mouseX, mouseY, partialTick));
    }));

    public static final FrameworkEvent<IScreenEvent.AfterDrawContainerBackground> AFTER_DRAW_CONTAINER_BACKGROUND = new FrameworkEvent<>(listeners -> (screen, stack, mouseX, mouseY) -> {
        listeners.forEach(listener -> listener.handle(screen, stack, mouseX, mouseY));
    });

    public static final FrameworkEvent<IScreenEvent.Opened> OPENED = new FrameworkEvent<>(listeners -> (screen) -> {
        listeners.forEach(listener -> listener.handle(screen));
    });
}
