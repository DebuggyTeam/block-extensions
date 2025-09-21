package gay.debuggy.block_extensions;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockExtensions implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Block Extensions");

	public static final String MOD_ID = "block_ex";

	@Override
	public void onInitialize() {
		BlockExBlocks.init();
		LOGGER.info("pineapple");
	}
}
