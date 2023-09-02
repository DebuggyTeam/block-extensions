package io.github.woodiertexas.block_extensions;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.HashMap;

import static io.github.woodiertexas.block_extensions.BlockExtensions.LOGGER;
import static io.github.woodiertexas.block_extensions.BlockExtensions.MOD_ID;

public class BlockExBlocks {
	public static HashMap<String, Block> blocksToRegister = new HashMap<>();

	// Blocks
	public static final Block BUGGED_PISTON = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_BARREL = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_CHISELED_BOOKSHELF = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block DECO_DAYLIGHT_DETECTOR = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_JIGSAW = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_NETHER_PORTAL = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_OBSERVER = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_SMITHING_TABLE = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_SMITHING_TABLE_TWO = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_CHAIN_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_REPEATING_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block HONEYED_PLANKS = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block MISSING_TEXTURE = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));


	public static void init() {
		blocksToRegister.put("bugged_piston", BUGGED_PISTON);
		blocksToRegister.put("deco_barrel", DECO_BARREL);
		blocksToRegister.put("deco_chiseled_bookshelf", DECO_CHISELED_BOOKSHELF);
		blocksToRegister.put("deco_daylight_detector", DECO_DAYLIGHT_DETECTOR);
		blocksToRegister.put("deco_jigsaw", DECO_JIGSAW);
		blocksToRegister.put("deco_nether_portal", DECO_NETHER_PORTAL);
		blocksToRegister.put("deco_observer", DECO_OBSERVER);
		blocksToRegister.put("deco_smithing_table", DECO_SMITHING_TABLE);
		blocksToRegister.put("deco_smithing_table_two", DECO_SMITHING_TABLE_TWO);
		blocksToRegister.put("fake_command_block", FAKE_COMMAND_BLOCK);
		blocksToRegister.put("fake_chain_command_block", FAKE_CHAIN_COMMAND_BLOCK);
		blocksToRegister.put("fake_repeating_command_block", FAKE_REPEATING_COMMAND_BLOCK);
		blocksToRegister.put("honeyed_planks", HONEYED_PLANKS);
		blocksToRegister.put("missing_texture", MISSING_TEXTURE);


		for (String blockId : blocksToRegister.keySet()) {
			LOGGER.info("Value of blocksToRegister: " + blocksToRegister.get(blockId));
			registerBlocks(blockId, blocksToRegister.get(blockId));
		}
	}

	public static void registerBlocks(String blockId, Block block) {
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, blockId), block);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, blockId), new BlockItem(block, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addItem(block));
	}
}
