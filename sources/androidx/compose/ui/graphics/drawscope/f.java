package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    @NotNull
    InterfaceC4814e a();

    void d(@NotNull LayoutDirection layoutDirection);

    long e();

    void f(@NotNull InterfaceC4814e interfaceC4814e);

    @NotNull
    C0 g();

    @NotNull
    LayoutDirection getLayoutDirection();

    void h(long j10);

    @Nullable
    GraphicsLayer i();

    @NotNull
    m j();

    void k(@Nullable GraphicsLayer graphicsLayer);

    void l(@NotNull C0 c02);
}
