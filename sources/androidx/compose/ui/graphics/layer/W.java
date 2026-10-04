package androidx.compose.ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.compose.ui.graphics.Q2;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final W f101281a = new W();

    @InterfaceC4345t
    public final void a(@NotNull RenderNode renderNode, @Nullable Q2 q22) {
        renderNode.setRenderEffect(q22 != null ? q22.a() : null);
    }
}
