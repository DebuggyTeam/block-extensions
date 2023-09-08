package gay.debuggy.block_extensions;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockExtensions implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Block Extensions");

	public static final String MOD_ID = "block_extensions";

	@Override
	public void onInitialize(ModContainer mod) {
		BlockExBlocks.init();
	}
}
