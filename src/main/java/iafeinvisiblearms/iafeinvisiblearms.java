package iafeinvisiblearms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import iafeinvisiblearms.Arm_Materials.Invisible_Diamond;
import iafeinvisiblearms.Arm_Materials.Invisible_Netherite;

public class iafeinvisiblearms implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();
;
    public static final String MOD_ID = "iafeinvisiblearms";
    public static final String MOD_NAME = "IAFE Invisible Arms";

    //定义物品
    public static final Item invisible_ingot=new Item(new Item.Settings().group(iafeinvisiblearms.Core));
    
    public static final ArmorMaterial invisible_diamond = new Invisible_Diamond();
    public static final Item invisible_diamond_HELMET = new ArmorItem(invisible_diamond, EquipmentSlot.HEAD, new Item.Settings().group(iafeinvisiblearms.Core));
    public static final Item invisible_diamond_CHESTPLATE = new ArmorItem(invisible_diamond, EquipmentSlot.CHEST, new Item.Settings().group(iafeinvisiblearms.Core));
    public static final Item invisible_diamond_LEGGINGS = new ArmorItem(invisible_diamond, EquipmentSlot.LEGS, new Item.Settings().group(iafeinvisiblearms.Core));
    public static final Item invisible_diamond_BOOTS = new ArmorItem(invisible_diamond, EquipmentSlot.FEET, new Item.Settings().group(iafeinvisiblearms.Core));
    
    public static final ArmorMaterial invisible_netherite = new Invisible_Netherite();
    public static final Item invisible_netherite_HELMET = new ArmorItem(invisible_netherite, EquipmentSlot.HEAD, new Item.Settings().group(iafeinvisiblearms.Core));
    public static final Item invisible_netherite_CHESTPLATE = new ArmorItem(invisible_netherite, EquipmentSlot.CHEST, new Item.Settings().group(iafeinvisiblearms.Core));
    public static final Item invisible_netherite_LEGGINGS = new ArmorItem(invisible_netherite, EquipmentSlot.LEGS, new Item.Settings().group(iafeinvisiblearms.Core));
    public static final Item invisible_netherite_BOOTS = new ArmorItem(invisible_netherite, EquipmentSlot.FEET, new Item.Settings().group(iafeinvisiblearms.Core));
    
    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        
        //注册物品
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_ingot"), invisible_ingot);
        
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_diamond_helmet"), invisible_diamond_HELMET);
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_diamond_chestplate"), invisible_diamond_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_diamond_leggings"), invisible_diamond_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_diamond_boots"), invisible_diamond_BOOTS);
        
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_netherite_helmet"), invisible_netherite_HELMET);
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_netherite_chestplate"), invisible_netherite_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_netherite_leggings"), invisible_netherite_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("iafeinvisiblearms", "invisible_netherite_boots"), invisible_netherite_BOOTS);
    }

    public static final ItemGroup Core = FabricItemGroupBuilder.create(new Identifier("iafeinvisiblearms", "core"))
			.icon(() -> new ItemStack(iafeinvisiblearms.invisible_ingot))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_ingot));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_diamond_HELMET));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_diamond_CHESTPLATE));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_diamond_LEGGINGS));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_diamond_BOOTS));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_netherite_HELMET));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_netherite_CHESTPLATE));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_netherite_LEGGINGS));
				stacks.add(new ItemStack(iafeinvisiblearms.invisible_netherite_BOOTS));
			}).build();
    
    
    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}