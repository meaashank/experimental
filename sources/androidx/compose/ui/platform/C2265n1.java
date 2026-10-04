package androidx.compose.ui.platform;

import android.view.RenderNode;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(24)
public final class C2265n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2265n1 f103902a = new C2265n1();

    @InterfaceC4345t
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
