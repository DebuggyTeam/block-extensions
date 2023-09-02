package gay.debuggy.block_extensions.client;

import gay.debuggy.block_extensions.BlockExBlocks;
import gay.debuggy.block_extensions.blocks.MissingTextureBlock;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class BlockExtensionsClient implements ClientModInitializer {
	
	// Thanks falkreon
	@Override
	public void onInitializeClient(ModContainer mod) {
		ColorProviderRegistry.BLOCK.register((state, view, pos, i) -> {
			return state.get(MissingTextureBlock.COLOR).getSignColor();
		}, BlockExBlocks.MISSING_TEXTURE);
	}
}
