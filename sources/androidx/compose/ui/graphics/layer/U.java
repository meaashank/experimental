package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(24)
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final U f101279a = new U();

    @InterfaceC4345t
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
