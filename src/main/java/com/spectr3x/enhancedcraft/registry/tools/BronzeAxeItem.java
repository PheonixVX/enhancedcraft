package com.spectr3x.enhancedcraft.registry.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class BronzeAxeItem extends AxeItem {

	public BronzeAxeItem(ToolMaterial material) {
		super(material, 6, -3f, new Item.Settings().group(ItemGroup.TOOLS));
	}
    
}
