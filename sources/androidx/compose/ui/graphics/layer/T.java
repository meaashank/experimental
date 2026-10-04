package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final T f101278a = new T();

    @InterfaceC4345t
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
