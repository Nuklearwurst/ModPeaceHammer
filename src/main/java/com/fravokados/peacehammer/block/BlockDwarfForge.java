package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * @author Nuklearwurst
 */
public class BlockDwarfForge extends BlockPH {

	private IIcon icon_bottom;
	private IIcon icon_top;
	private IIcon icon_top_active;

	public BlockDwarfForge() {
		super(Material.rock, Strings.Block.DWARF_FORGE);
		setHardness(1.5F);
		setResistance(7.0F);
		setStepSound(soundTypePiston);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if(side == 0) {
			return icon_bottom;
		} else if(side == 1) {
			return meta == 0 ? icon_top : icon_top_active;
		} else {
			return blockIcon;
		}
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + "esse_side");
		this.icon_bottom = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + "esse_ground");
		this.icon_top = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + "esse_top");
		this.icon_top_active = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + "esse_top_on");
	}
}
