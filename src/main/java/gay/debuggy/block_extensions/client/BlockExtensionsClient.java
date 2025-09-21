package gay.debuggy.block_extensions.client;

import gay.debuggy.block_extensions.BlockExBlocks;
import gay.debuggy.block_extensions.blocks.MissingTextureBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;


public class BlockExtensionsClient implements ClientModInitializer {
	
	// Thanks falkreon
	@Override
	public void onInitializeClient() {
		ColorProviderRegistry.BLOCK.register((state, view, pos, i) -> {
			return state.get(MissingTextureBlock.COLOR).getSignColor();
		}, BlockExBlocks.MISSING_TEXTURE);
	}
}
