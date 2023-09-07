package gay.debuggy.block_extensions;

import gay.debuggy.block_extensions.blocks.MissingTextureBlock;
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

import static gay.debuggy.block_extensions.BlockExtensions.MOD_ID;

public class BlockExBlocks {
	public static HashMap<String, Block> blocksToRegister = new HashMap<>();

	// General Blocks
	public static final Block BUGGED_PISTON = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block CAST_IRON_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.IRON_BLOCK));
	public static final Block COBBLESTONE_TILE = new Block(QuiltBlockSettings.copyOf(Blocks.STONE));
	public static final Block DECO_BARREL = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block DECO_CHISELED_BOOKSHELF = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block DECO_DAYLIGHT_DETECTOR = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block DECO_JIGSAW = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_OBSERVER = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DECO_SMITHING_TABLE = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_CHAIN_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_NETHER_PORTAL_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block FAKE_REPEATING_COMMAND_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block HONEYED_PLANKS = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final MissingTextureBlock MISSING_TEXTURE = new MissingTextureBlock(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block STICKY_BUGGED_PISTON = new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Block STONE_TILE = new Block(QuiltBlockSettings.copyOf(Blocks.STONE));
	public static final Block THIRTY_SIX = new Block(QuiltBlockSettings.copyOf(Blocks.GRASS_BLOCK));
	public static final Block WROUGHT_IRON_BLOCK = new Block(QuiltBlockSettings.copyOf(Blocks.IRON_BLOCK));
	
	public static final Block RED_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.RED_WOOL));
	public static final Block ORANGE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.ORANGE_WOOL));
	public static final Block YELLOW_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.YELLOW_WOOL));
	public static final Block LIME_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.LIME_WOOL));
	public static final Block GREEN_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.GREEN_WOOL));
	public static final Block CYAN_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.CYAN_WOOL));
	public static final Block LIGHT_BLUE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL));
	public static final Block BLUE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.BLUE_WOOL));
	public static final Block PURPLE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.PURPLE_WOOL));
	public static final Block MAGENTA_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.MAGENTA_WOOL));
	public static final Block PINK_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.PINK_WOOL));
	public static final Block BROWN_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.BROWN_WOOL));
	public static final Block BLACK_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.BLACK_WOOL));
	public static final Block GRAY_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.GRAY_WOOL));
	public static final Block LIGHT_GRAY_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL));
	public static final Block WHITE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	
	public static final Block AGENDER_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block AROACE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block AROMANTIC_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block ASEXUAL_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block BISEXUAL_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DEMIBOY_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DEMIGIRL_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block DISABILITY_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block GAY_MEN_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block GAY_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block GENDERFAE_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block GENDERQUEER_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block LESBIAN_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block NONBINARY_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block PANSEXUAL_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block PLURAL_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block POLYSEXUAL_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));
	public static final Block TRANSGENDER_QUILT_PATCH = new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL));


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
		blocksToRegister.put("sticky_bugged_piston", STICKY_BUGGED_PISTON);
		blocksToRegister.put("stone_tile", STONE_TILE);
		blocksToRegister.put("cobblestone_tile", COBBLESTONE_TILE);
		blocksToRegister.put("thirty_six", THIRTY_SIX);
		blocksToRegister.put("wrought_iron_block", WROUGHT_IRON_BLOCK);
		
		blocksToRegister.put("red_quilt_patch", RED_QUILT_PATCH);
		blocksToRegister.put("orange_quilt_patch", ORANGE_QUILT_PATCH);
		blocksToRegister.put("yellow_quilt_patch", YELLOW_QUILT_PATCH);
		blocksToRegister.put("lime_quilt_patch", LIME_QUILT_PATCH);
		blocksToRegister.put("green_quilt_patch", GREEN_QUILT_PATCH);
		blocksToRegister.put("cyan_quilt_patch", CYAN_QUILT_PATCH);
		blocksToRegister.put("light_blue_quilt_patch", LIGHT_BLUE_QUILT_PATCH);
		blocksToRegister.put("blue_quilt_patch", BLUE_QUILT_PATCH);
		blocksToRegister.put("purple_quilt_patch", PURPLE_QUILT_PATCH);
		blocksToRegister.put("magenta_quilt_patch", MAGENTA_QUILT_PATCH);
		blocksToRegister.put("pink_quilt_patch", PINK_QUILT_PATCH);
		blocksToRegister.put("brown_quilt_patch", BROWN_QUILT_PATCH);
		blocksToRegister.put("black_quilt_patch", BLACK_QUILT_PATCH);
		blocksToRegister.put("gray_quilt_patch", GRAY_QUILT_PATCH);
		blocksToRegister.put("light_gray_quilt_patch", LIGHT_GRAY_QUILT_PATCH);
		blocksToRegister.put("white_quilt_patch", WHITE_QUILT_PATCH);
		
		blocksToRegister.put("agender_quilt_patch", AGENDER_QUILT_PATCH);
		blocksToRegister.put("aroace_quilt_patch", AROACE_QUILT_PATCH);
		blocksToRegister.put("aromantic_quilt_patch", AROMANTIC_QUILT_PATCH);
		blocksToRegister.put("asexual_quilt_patch", ASEXUAL_QUILT_PATCH);
		blocksToRegister.put("bisexual_quilt_patch", BISEXUAL_QUILT_PATCH);
		blocksToRegister.put("demiboy_quilt_patch", DEMIBOY_QUILT_PATCH);
		blocksToRegister.put("demigirl_quilt_patch", DEMIGIRL_QUILT_PATCH);
		blocksToRegister.put("disability_quilt_patch", DISABILITY_QUILT_PATCH);
		blocksToRegister.put("gay_men_quilt_patch", GAY_MEN_QUILT_PATCH);
		blocksToRegister.put("gay_quilt_patch", GAY_QUILT_PATCH);
		blocksToRegister.put("genderfae_quilt_patch", GENDERFAE_QUILT_PATCH);
		blocksToRegister.put("genderqueer_quilt_patch", GENDERQUEER_QUILT_PATCH);
		blocksToRegister.put("lesbian_quilt_patch", LESBIAN_QUILT_PATCH);
		blocksToRegister.put("nonbinary_quilt_patch", NONBINARY_QUILT_PATCH);
		blocksToRegister.put("pansexual_quilt_patch", PANSEXUAL_QUILT_PATCH);
		blocksToRegister.put("plural_quilt_patch", PLURAL_QUILT_PATCH);
		blocksToRegister.put("polysexual_quilt_patch", POLYSEXUAL_QUILT_PATCH);
		blocksToRegister.put("transgender_quilt_patch", TRANSGENDER_QUILT_PATCH);


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
