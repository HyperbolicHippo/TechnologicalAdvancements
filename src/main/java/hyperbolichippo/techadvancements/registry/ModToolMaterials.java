package hyperbolichippo.techadvancements.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterials {
    public static final FlintToolMaterial FLINT = new FlintToolMaterial();
}

class FlintToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 60;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
