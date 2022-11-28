package hyperbolichippo.techadvancements.registry;

import hyperbolichippo.techadvancements.TechnologicalAdvancementsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FLINT_SHARD = registerItem("flint_shard",
            new Item(new FabricItemSettings().group(ModItemGroups.ITEM_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("tech_advance", name), item);
    }

    public static void registerModItems() {
        // method needs to be called to make sure the class is loaded and all the items get registered
        TechnologicalAdvancementsMod.LOGGER.info("Registering mod items...");
    }
}
