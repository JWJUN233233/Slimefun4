package io.github.thebusybiscuit.slimefun4.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.HashSet;
import java.util.Set;

/**
 * This is a simple utility class for {@link ItemStack}
 *
 * @author JWJUN233233
 */
public class ItemUtils {
    /**
     *
     * @param itemStacks original item array
     * @return how many items are there in total
     *
     * @author JWJUN233233
     */
    public static int getAllItemAmount(@Nonnull ItemStack... itemStacks) {
        int amount = 0;
        for (ItemStack itemStack : itemStacks) {
            if (itemStack == null || itemStack.getType().isAir()) continue;
            amount += itemStack.getAmount();
        }

        return amount;
    }

    /**
     *
     * @param itemStacks original item array
     * @return how many kinds of item are there in total
     *
     * @author JWJUN233233
     */
    public static int getAllItemTypeAmount(@Nonnull ItemStack... itemStacks) {
        Set<SlimefunItem> sfitems = new HashSet<>();
        Set<Material> materials = new HashSet<>();

        for (ItemStack itemStack : itemStacks) {
            if (itemStack == null || itemStack.getType().isAir()) continue;
            SlimefunItem sfitem = SlimefunItem.getByItem(itemStack);
            if (sfitem != null) sfitems.add(sfitem);
            else materials.add(itemStack.getType());
        }

        return sfitems.size() + materials.size();
    }
}
