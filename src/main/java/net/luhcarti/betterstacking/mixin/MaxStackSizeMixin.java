package net.luhcarti.betterstacking.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ItemStack.class)
public class MaxStackSizeMixin {

    /**
     * @author luhcarti
     * @reason to modify stack size
     */
    @Overwrite
    public int getMaxStackSize() {
        ItemStack stack = (ItemStack)(Object)this;

        if (stack.is(Items.WATER_BUCKET) ||
                stack.is(Items.COD_BUCKET) ||
                stack.is(Items.SALMON_BUCKET) ||
                stack.is(Items.TROPICAL_FISH_BUCKET) ||
                stack.is(Items.PUFFERFISH_BUCKET) ||
                stack.is(Items.AXOLOTL_BUCKET) ||
                stack.is(Items.TADPOLE_BUCKET) ||
                stack.is(Items.LAVA_BUCKET) ||
                stack.is(Items.POWDER_SNOW_BUCKET) ||
                stack.is(Items.MILK_BUCKET)) {
            return 1;
        } else {
            return 64;
        }
    }
}
