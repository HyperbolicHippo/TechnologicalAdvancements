package hyperbolichippo.techadvancements.registry;

import hyperbolichippo.techadvancements.TechnologicalAdvancementsMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(TechnologicalAdvancementsMod.MOD_ID, "item_group"),
            () -> new ItemStack(Blocks.BLUE_CONCRETE_POWDER));
}
