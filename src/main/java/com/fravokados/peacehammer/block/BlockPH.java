package com.fravokados.peacehammer.block;


import com.fravokados.peacehammer.ModPeaceHammer;
import com.fravokados.peacehammer.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * @author Nuklearwurst
 */
public class BlockPH extends Block {

	public BlockPH() {
		this(Material.rock);
	}

	public BlockPH(Material material) {
		super(material);
		this.setCreativeTab(ModPeaceHammer.CREATIVE_TABS);
	}

	public BlockPH(String name) {
		this();
		this.setBlockName(name);
	}

	public BlockPH(Material mat, String name) {
		this(mat);
		this.setBlockName(name);
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
	}

}
