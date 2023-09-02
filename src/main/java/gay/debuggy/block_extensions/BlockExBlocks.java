package gay.debuggy.block_extensions;

import gay.debuggy.block_extensions.blocks.MissingTextureBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.HashMap;

import static gay.debuggy.block_extensions.BlockExtensions.LOGGER;
import static gay.debuggy.block_extensions.BlockExtensions.MOD_ID;

public class BlockExBlocks {
	public static HashMap<String, Block> blocksToRegister = new HashMap<>();

	// Blocks
	public static final Block BUGGED_PISTON = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block CAST_IRON_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block DECO_BARREL = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_CHISELED_BOOKSHELF = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block DECO_DAYLIGHT_DETECTOR = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_JIGSAW = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_OBSERVER = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_SMITHING_TABLE = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_CHAIN_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_NETHER_PORTAL_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_REPEATING_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block HONEYED_PLANKS = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final MissingTextureBlock MISSING_TEXTURE = new MissingTextureBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block STONE_TILE = new Block(QuiltBlockSettings.copyOf(Blocks.STONE));
	public static final Block THIRTY_SIX = new Block(QuiltBlockSettings.copyOf(Blocks.GRASS_BLOCK));
	public static final Block WROUGHT_IRON_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.IRON_BLOCK));


	public static void init() {
		blocksToRegister.put("bugged_piston", BUGGED_PISTON);
		blocksToRegister.put("deco_barrel", DECO_BARREL);
		blocksToRegister.put("deco_chiseled_bookshelf", DECO_CHISELED_BOOKSHELF);
		blocksToRegister.put("deco_daylight_detector", DECO_DAYLIGHT_DETECTOR);
		blocksToRegister.put("deco_jigsaw", DECO_JIGSAW);
		blocksToRegister.put("deco_observer", DECO_OBSERVER);
		blocksToRegister.put("deco_smithing_table", DECO_SMITHING_TABLE);
		blocksToRegister.put("cast_iron_block", CAST_IRON_BLOCK);
		blocksToRegister.put("fake_command_block", FAKE_COMMAND_BLOCK);
		blocksToRegister.put("fake_chain_command_block", FAKE_CHAIN_COMMAND_BLOCK);
		blocksToRegister.put("fake_nether_portal_block", FAKE_NETHER_PORTAL_BLOCK);
		blocksToRegister.put("fake_repeating_command_block", FAKE_REPEATING_COMMAND_BLOCK);
		blocksToRegister.put("honeyed_planks", HONEYED_PLANKS);
		blocksToRegister.put("missing_texture", MISSING_TEXTURE);
		blocksToRegister.put("stone_tile", STONE_TILE);
		blocksToRegister.put("thirty_six", THIRTY_SIX);
		blocksToRegister.put("wrought_iron_block", WROUGHT_IRON_BLOCK);


		for (String blockId : blocksToRegister.keySet()) {
			registerBlocks(blockId, blocksToRegister.get(blockId));
		}
	}

	public static void registerBlocks(String blockId, Block block) {
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, blockId), block);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, blockId), new BlockItem(block, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addItem(block));
	}
}
