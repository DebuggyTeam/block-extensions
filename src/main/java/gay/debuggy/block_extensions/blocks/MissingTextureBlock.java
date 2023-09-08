package gay.debuggy.block_extensions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MissingTextureBlock extends Block {
	public static final EnumProperty<DyeColor> COLOR = EnumProperty.of("color", DyeColor.class);
	
	public MissingTextureBlock(Settings settings) {
		super(settings);
	}
	
	// Thanks falkreon
	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		builder.add(COLOR);
	}
	
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemStack stack = player.getStackInHand(hand);
		if (player.canModifyBlocks() && stack.getItem() instanceof DyeItem dye) {
			DyeColor dyeColor = dye.getColor();
			world.setBlockState(pos, state.with(COLOR, dyeColor), Block.NOTIFY_ALL);
			
			if (!player.isCreative()) {
				stack.decrement(1);
			}
			
			return ActionResult.SUCCESS;
		}
		
		return ActionResult.PASS;
	}
}
