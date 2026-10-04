package androidx.compose.ui.platform;

import android.view.RenderNode;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(28)
public final class C2268o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2268o1 f103906a = new C2268o1();

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
