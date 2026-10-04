package androidx.compose.ui.platform;

import android.view.RenderNode;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class C2262m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2262m1 f103900a = new C2262m1();

    @InterfaceC4345t
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
