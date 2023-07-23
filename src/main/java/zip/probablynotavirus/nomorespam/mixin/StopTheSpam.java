package zip.probablynotavirus.nomorespam.mixin;

import net.minecraft.client.renderer.GlDebugTextUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GlDebugTextUtils.class)
public abstract class StopTheSpam {
    @Inject(method = "printDebugLog", at = @At("HEAD"), cancellable = true)
    private static void shutup(int p_209244_0_, int p_209244_1_, int p_209244_2_, int p_209244_3_, int p_209244_4_, long p_209244_5_, long p_209244_7_, CallbackInfo ci)
    {
        ci.cancel();
    }
}
