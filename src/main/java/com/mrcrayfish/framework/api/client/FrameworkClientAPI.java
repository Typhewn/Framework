package com.mrcrayfish.framework.api.client;

import com.mrcrayfish.framework.api.client.resources.IDataLoader;
import com.mrcrayfish.framework.api.client.resources.IResourceSupplier;
import com.mrcrayfish.framework.api.serialize.DataObject;
import com.mrcrayfish.framework.client.JsonDataManager;
import com.mrcrayfish.framework.client.model.BakedOpenModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

/**
 * Author: MrCrayfish
 */
public class FrameworkClientAPI
{
    /**
     * A helper method to access custom data from an Open Model via a Resource Location. Be
     * aware if the model is reloaded and this data is being cached in any way, invalidate it and
     * retrieve the data again. This method returns a DataObject even if the model doesn't have any
     * custom data or the model doesn't exist, however the object will be empty.
     *
     * @param modelLocation the location of the model
     * @return a data object containing the custom data or an empty object
     */
    public static DataObject getOpenModelData(ResourceLocation modelLocation)
    {
        // Internal code, do not call these directly since they may break in a future update.
        return BakedOpenModel.getData(modelLocation);
    }

    /**
     * A helper method to access custom data from an Open Model via a Block State. Since a block can
     * have different models depending on a block state, this method gets the data from the model
     * tied to the specific block state. Be aware if the model is reloaded and this data is being
     * cached in any way, invalidate it and retrieve the data again. This method returns a
     * DataObject even if the model doesn't have any custom data or the model doesn't exist, however
     * the object will be empty.
     *
     * @param state a block state, which the data is retrieved from the model tied to it
     * @return a data object containing the custom data or an empty object
     */
    public static DataObject getOpenModelData(BlockState state)
    {
        // Internal code, do not call these directly since they may break in a future update.
        return BakedOpenModel.getData(state);
    }

    /**
     * A helper method to access custom data from an Open Model via an Item. Be aware if the model
     * is reloaded and this data is being cached in any way, invalidate it and retrieve the data
     * again. This method returns a DataObject even if the model doesn't have any custom data or the
     * model doesn't exist, however the object will be empty.
     *
     * @param item an item, which the data is retrieved from the model tied to it
     * @return a data object containing the custom data or an empty object
     */
    public static DataObject getOpenModelData(Item item)
    {
        // Internal code, do not call these directly since they may break in a future update.
        return BakedOpenModel.getData(item);
    }

    /**
     * A helper method to access custom data from an Open Model via an ItemStack with support for
     * overrides. Be aware if the model is reloaded and this data is being cached in any way,
     * invalidate it and retrieve the data again. This method returns a DataObject even if the model
     * doesn't have any custom data or the model doesn't exist, however the object will be empty.
     *
     * @param stack an item stack, which the data is retrieved from the model tied to it
     * @param level the level instance or null
     * @param entity the living entity using the stack or null
     * @param seed
     * @return a data object containing the custom data or an empty object
     */
    public static DataObject getOpenModelData(ItemStack stack, @Nullable Level level, @Nullable LivingEntity entity, int seed)
    {
        // Internal code, do not call these directly since they may break in a future update.
        return BakedOpenModel.getData(stack, level, entity, seed);
    }

    /**
     * Registers a data loader. This must be called during the construction phase. See
     * {@link net.minecraftforge.fml.DistExecutor} to safely execute on the client side.
     *
     * @param loader the data loader instance
     */
    public static <T extends IResourceSupplier> void registerDataLoader(IDataLoader<T> loader)
    {
        // Internal code, do not call these directly since they may break in a future update.
        JsonDataManager.getInstance().addLoader(loader);
    }
}
