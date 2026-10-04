package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.compose.ui.graphics.Q2;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class C2259l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2259l1 f103896a = new C2259l1();

    @InterfaceC4345t
    public final void a(@NotNull RenderNode renderNode, @Nullable Q2 q22) {
        renderNode.setRenderEffect(q22 != null ? q22.a() : null);
    }
}
