package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.ModPeaceHammer;
import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import com.google.common.collect.Sets;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.Set;

/**
 * @author Nuklearwurst
 */
public class ItemDwarfAxe extends ItemTool {

	private static final Set effectiveBlocks = Sets.newHashSet(Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin);
	private static final float damageVsEntity = 5.0F;

	public ItemDwarfAxe() {
		super(damageVsEntity, ToolMaterial.IRON, effectiveBlocks);
		this.setCreativeTab(ModPeaceHammer.CREATIVE_TABS);
		this.setUnlocalizedName(Strings.Item.DWARF_AXE);
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack s) {
		return String.format("item.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		itemIcon = reg.registerIcon(getUnwrappedUnlocalizedName(getUnlocalizedName()));
	}

	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.block;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
		return stack;
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase origin) {
		stack.damageItem(1, origin);
		return true;
	}

}
