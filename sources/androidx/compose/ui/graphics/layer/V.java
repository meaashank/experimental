package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(28)
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final V f101280a = new V();

    @InterfaceC4345t
    public final int a(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    @InterfaceC4345t
    public final int b(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    @InterfaceC4345t
    public final void c(@NotNull RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    @InterfaceC4345t
    public final void d(@NotNull RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
