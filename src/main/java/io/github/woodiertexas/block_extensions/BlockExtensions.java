package io.github.woodiertexas.block_extensions;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockExtensions implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Block Extensions");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}

	public static final Block DAYLIGHT_DETECTOR = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block BUGGED_PISTON = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block DECORATIVE_JIGSAW = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block DECORATIVE_OBSERVER = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block DECORATIVE_SMITHING_TABLE = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block DECORATIVE_SMITHING_TABLE_TWO = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block DECORATIVE_NETHER_PORTAL = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));
	public static final Block HONEYED_PLANKS = new Block(QuiltBlockSettings.of(Material.WOOL).strength(1f).sounds(BlockSoundGroup.WOOL));


	static {

		// Block string names
		String[] blocksArray = {
				"daylight_detector", "bugged_piston", "decorative_jigsaw", "decorative_observer", "decorative_smithing_table",
				"decorative_smithing_table_two", "decorative_nether_portal", "honeyed_planks"
		};

		Block[] anotherBlocksArray = {
				DAYLIGHT_DETECTOR, BUGGED_PISTON, DECORATIVE_JIGSAW, DECORATIVE_OBSERVER, DECORATIVE_SMITHING_TABLE,
				DECORATIVE_SMITHING_TABLE_TWO, DECORATIVE_NETHER_PORTAL, HONEYED_PLANKS
		};

		// Checks to see if the arrays are of the same length. If not, stop the Minecraft process.
		if (blocksArray.length != anotherBlocksArray.length) {
			throw new RuntimeException("Mismatched array lengths.\nLength of blocksArray: " + blocksArray.length +
					"\nLength of anotherBlocksArray: " + anotherBlocksArray.length);
		}

		// Loops through the length of both arrays and registers the blocks found in said arrays.
		for (int i = 0; i < blocksArray.length; i++) {
			Registry.register(Registry.BLOCK, new Identifier("block_extensions", blocksArray[i]), anotherBlocksArray[i]);
			Registry.register(Registry.ITEM, new Identifier("block_extensions", blocksArray[i]),
					new BlockItem(anotherBlocksArray[i], new QuiltItemSettings().group(ItemGroup.DECORATIONS)));
		}
	}
}
