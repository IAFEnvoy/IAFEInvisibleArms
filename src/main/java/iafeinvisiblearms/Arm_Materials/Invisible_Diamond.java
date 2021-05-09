package iafeinvisiblearms.Arm_Materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class Invisible_Diamond implements ArmorMaterial {
	private static final int Enchantability=10;
	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3}; 

	@Override
	public int getDurability(EquipmentSlot slot) {
		// TODO Auto-generated method stub
		return BASE_DURABILITY[slot.getEntitySlotId()] * Enchantability;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return Enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "invisible_diamond";
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		// TODO Auto-generated method stub
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(Items.DIAMOND);
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return 0;
	}

}
